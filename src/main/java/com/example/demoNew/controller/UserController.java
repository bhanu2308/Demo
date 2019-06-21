 package com.example.demoNew.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoNew.entity.User;
@RestController
public class UserController {
	@RequestMapping("/")
	 public String checkStatus()
	 {
		 return "hello";
		 
	 }
	@PostMapping("/")
	
	public User[] createusers()
	{
		User user1=new User("Female","Bhanu");
		User user2=new User("Female","Kavya");
		User user3=new User("Male","TulasiRam");
		User user4=new User("Female","Bharathi");
		User[] user= {user1,user2,user3,user4};
		return user;
	}
	public 
	
		
		
		
}
