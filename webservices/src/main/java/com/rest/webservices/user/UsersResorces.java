package com.rest.webservices.user;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsersResorces {
   
	/*@Autowired
	private  UserDaoServices service;*/
	private UserDaoServices service;

	public UsersResorces(UserDaoServices service) {
		this.service = service;
	}
	
	
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
   
   @GetMapping("/users/{id}")
   public Users getAllUsers(@PathVariable String id)
    {
	return service.findOne(id);
	}
   
   @PostMapping("/create")
   public void createUser(@RequestBody Users user )
   {
	   service.save(user);
   }
   
   @DeleteMapping("/remove/{id}")
   public void removeUser(@PathVariable String id)
   {
	   service.deleteById(id);
   }
   
   
}
