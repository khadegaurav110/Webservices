package com.rest.webservices.user;

import java.time.LocalDate;

public class Users {
	
	private String id;
	private String name;
	private LocalDate birthdate;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String id, String name, LocalDate birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", birthdate=" + birthdate + "]";
	}
	
}
