package com.spring.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.entity.AdvertiseEntity;
import com.spring.entity.UserEntity;
import com.spring.json.Advertise;
import com.spring.rest.repository.AdvertiseRepository;
import com.spring.rest.repository.UserRepository;
import com.spring.utils.AdvertiseUtils;

@Service
public class AdvertiseServiceImpl implements AdvertiseService 
{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AdvertiseRepository advertiseRepository;
	

	@Override
	public Object save(Advertise advertise, String authToken)
	{
		Random random =new Random();
		
		UserEntity userEntity=userRepository.findBySessionId(authToken);
		if (userEntity!=null)
		{
			String postId =Integer.toString(random.nextInt(10000));
			advertise.setPostid(postId);
			AdvertiseEntity advertiseEntity= advertiseRepository.save(AdvertiseUtils.convertAdvertiseToAdvertiseEntity(advertise));
			return AdvertiseUtils.convertAdvertiseEntityToAdvertise(advertiseEntity);
		}
		else 
		{
			return "{\"result\": \"failed\",\"message\": \" Session Id is wrong\"}";
		}
			
	}

	@Override
	public Object update(Advertise advertise, String authToken,String id) {
		UserEntity userEntity=userRepository.findBySessionId(authToken);
		if (userEntity!=null)
		{ 
			AdvertiseEntity advertiseEntity=advertiseRepository.findById(Long.valueOf(id)).get();
			if(advertiseEntity != null) 
			{
				advertiseEntity.setTitle(advertise.getTitle());
				advertiseEntity.setName(advertise.getName());
				advertiseEntity.setDescription(advertise.getDescription());
				advertiseEntity.setCategory(advertise.getCategory());
				advertiseEntity.setStatus(advertise.getStatus());
				advertiseEntity.setSearchText(advertise.getSearchText());
				advertiseEntity=advertiseRepository.save(advertiseEntity);
				return AdvertiseUtils.convertAdvertiseEntityToAdvertise(advertiseEntity);
			}
			else
				return "{\"result\": \"failed\",\"message\": \"Advertisement Id is wrong\"}";
			
		}
		else 
		{
			return "{\"result\": \"failed\",\"message\": \"Session Id is wrong\"}";
		}
	
	}

	@Override
	public List<Advertise> getAdvertiseBySessionId(String authToken) {
		String userName=userRepository.findBySessionId(authToken).getFirstName();
		return AdvertiseUtils.convertAdvertiseEntityListToAdvertiseList( advertiseRepository.findByName(userName));
	}

	@Override
	public List<Advertise> getAdvertiseByPostId(String authToken, String postId) 
	{
		String userName=userRepository.findBySessionId(authToken).getFirstName();
		List<Advertise> userAdvertise=AdvertiseUtils.convertAdvertiseEntityListToAdvertiseList( advertiseRepository.findByName(userName));
		List<Advertise>requiredAdvertise=userAdvertise.stream().filter(advertise -> postId.equals(advertise.getPostid())).collect(Collectors.toList());
		return requiredAdvertise;
	}

	@Override
	public boolean deleteAdvertiseByPostId(String authToken, String postId) {
		String userName=userRepository.findBySessionId(authToken).getFirstName();
		List<Advertise> userAdvertise=AdvertiseUtils.convertAdvertiseEntityListToAdvertiseList( advertiseRepository.findByName(userName));//Getting Advertise of Logged in User
		Advertise advertise = AdvertiseUtils.convertAdvertiseEntityToAdvertise(advertiseRepository.findByPostId(postId));//Getting Specific Advertise
		if (userAdvertise.contains(advertise))
		{
			advertiseRepository.deleteByPostId(postId);
			return true;
		}
		
		return false;
	}

	@Override
	public List<Advertise> getAdvertiseBySearchText(String searchText) 
	{
		return AdvertiseUtils.convertAdvertiseEntityListToAdvertiseList(
				advertiseRepository.findBySearchText(searchText));
	
	}

	@Override
	public List<Advertise> getAdvertiseByCategory(String category) {
		
		return AdvertiseUtils.convertAdvertiseEntityListToAdvertiseList(
				advertiseRepository.findByCategory(category));
	}

	@Override
	public List<Advertise> getAdvertiseByName(String name) {
		return AdvertiseUtils.convertAdvertiseEntityListToAdvertiseList(
				advertiseRepository.findByName(name));
	}

	@Override
	public Advertise getAdvertiseByPostId(String postId) {
		
		return AdvertiseUtils.convertAdvertiseEntityToAdvertise(
				advertiseRepository.findByPostId(postId));
	}

	@Override
	public List<String> getAllCategory() {
		
		return AdvertiseUtils.convertAdvertiseEntityListToAdvertiseList(
				advertiseRepository.findAll()).stream().
				map(Advertise :: getCategory).distinct().collect(Collectors.toList());
		
	}


	@Override
	public List<Advertise> getAllAdvertise() {
		
		return AdvertiseUtils.convertAdvertiseEntityListToAdvertiseList(
				advertiseRepository.findAll());
	}



	

}
