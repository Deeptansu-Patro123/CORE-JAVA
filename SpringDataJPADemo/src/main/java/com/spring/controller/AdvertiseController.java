package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spring.json.Advertise;
import com.spring.service.AdvertiseService;


@RestController
@RequestMapping("/myapp")
public class AdvertiseController 
{
	@Autowired
	private AdvertiseService registrationService;
	
	@PostMapping(value="/advertisement", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Object  postAdvertise(@RequestBody Advertise advertise,@RequestHeader(name="auth-token") String authToken)
	{
		return registrationService.save(advertise,authToken);
	}
	@PostMapping(value="/advertisement/{ID}", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Object  updateAdvertise(@RequestBody Advertise advertise,@RequestHeader(name="auth-token") String authToken,@PathVariable(value="id") String id)
	{
	  return registrationService.update(advertise,authToken,id);
	}
	@GetMapping("/advertisement/user")
	public List<Advertise> getAdvertiseBySessionId(@RequestHeader(name="auth-token") String authToken) {
		return registrationService.getAdvertiseBySessionId(authToken);
	}
	@GetMapping("/advertisement/user/{postId}")
	public List<Advertise> getAdvertiseByPostId(@RequestHeader(name="auth-token") String authToken,@PathVariable(value="postId") String postId) {
		return registrationService.getAdvertiseByPostId(authToken,postId);
	}
	@DeleteMapping("/advertisement/user/{postId}")
	public boolean deleteAdvertiseByPostId(@RequestHeader(name="auth-token") String authToken,@PathVariable(value="postId") String postId) {
		return registrationService.deleteAdvertiseByPostId(authToken,postId);
	}
	@GetMapping("/advertisement/searchText/{searchText}")
	public List<Advertise> getAdvertiseBySearchText(@PathVariable(value="searchText") String searchText)
	{
		return registrationService.getAdvertiseBySearchText(searchText);
	}
	@GetMapping("/advertisement/category/{category}")
	public List<Advertise> getAdvertiseByCategory(@PathVariable(value="category") String category)
	{
		return registrationService.getAdvertiseByCategory(category);
	}
	@GetMapping("/advertisement/postedBy/{name}")
	public List<Advertise> getAdvertiseByName(@PathVariable(value="name") String name)
	{
		return registrationService.getAdvertiseByName(name);
	}
	@GetMapping("/advertisement/PostId/{postId}")
	public Advertise getAdvertiseByPostId(@PathVariable(value="postId") String postId)	
	{
		return registrationService.getAdvertiseByPostId(postId);
	}
	@GetMapping("/advertisement/category")
	public List<String> getAllCategory()
	{
		return registrationService.getAllCategory();
	}
	@GetMapping("/advertisementList")
	public List<Advertise> getAllAdvertise()
	{
		return registrationService.getAllAdvertise();
	}
}
