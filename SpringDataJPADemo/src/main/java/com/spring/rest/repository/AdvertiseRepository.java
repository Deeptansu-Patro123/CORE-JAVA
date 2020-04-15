package com.spring.rest.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.spring.entity.AdvertiseEntity;

@Component
public interface AdvertiseRepository extends JpaRepository<AdvertiseEntity, Long> 
{
	List<AdvertiseEntity> findByName(String name);
	AdvertiseEntity findByPostId(String postId);
	void deleteByPostId(String postId);
	
	List<AdvertiseEntity> findBySearchText(String searchText);
	List<AdvertiseEntity> findByCategory(String category);

}
