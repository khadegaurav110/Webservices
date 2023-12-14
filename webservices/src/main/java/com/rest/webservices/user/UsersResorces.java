package com.rest.webservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsersResorces {
   
	@Autowired
	private  UserDaoServices service;
	
	
	@GetMapping("/users")
    public String getUsers()
     {
	return "Hello World";
	}
   
   
   
   
   @GetMapping("/usersall")
   public List<Users> getAllUsers()
    {
	return service.findAll();
	}
   
   
}
