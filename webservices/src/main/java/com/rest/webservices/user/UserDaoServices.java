package com.rest.webservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoServices {
	
	private static List<Users> users= new ArrayList<>();
	
	static {
		users.add(new Users(1,"gaurav",LocalDate.now().minusYears(30)));
		users.add(new Users(2,"magesh",LocalDate.now().minusYears(20)));
		

	}
	
	public List<Users> findAll()
	{
		return users;
	}

}
