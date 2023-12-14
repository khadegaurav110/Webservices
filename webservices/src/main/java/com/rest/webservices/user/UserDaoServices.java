package com.rest.webservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


import org.springframework.stereotype.Component;



@Component
public class UserDaoServices {
	
	private static List<Users> users= new ArrayList<>();
	
	static {
		users.add(new Users("1","gaurav",LocalDate.now().minusYears(30)));
		users.add(new Users("2","magesh",LocalDate.now().minusYears(20)));
		

	}
	
	public List<Users> findAll()
	{
		return users;
	}

	

	/*//public Users findOne(String id)
	{
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();

		//return users.stream().filter(t->t.(Users)getId.equals(id)).findFirst.get();
	}*/



	public Users findOne(String id) {
		// TODO Auto-generated method stub
		//return users.stream().filter(t->t.getId().equals(id))).findFirst().get();
		//return users.stream().filter(t->t.getId().equals(id)).findFirst().get();
		Predicate<? super Users> predicate = user -> user.getId().equals(id); 
		return users.stream().filter(predicate).findFirst().get();
	}



	public Users save(Users user) {

		users.add(user);
          return user;
	}



	public void deleteById(String id) {
		Predicate<? super Users> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);		
	}
	
	

}
