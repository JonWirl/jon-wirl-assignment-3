package com.coderscampus.assignment3;

// User POJO

public class User {
	
	private String username;
	private String password;
	private String name;
	
// User Constructor
	
	public User (String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
// User Getters

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}
		
		
}
