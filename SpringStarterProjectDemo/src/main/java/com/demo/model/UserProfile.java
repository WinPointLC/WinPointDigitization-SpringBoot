package com.demo.model;

import java.util.ArrayList;

public class UserProfile {

	String name;
	String password;
	String email = "email";
	ArrayList userProfileList;
	

	
	public ArrayList getUserProfileList() {
		return userProfileList;
	}




	public void setUserProfileList(ArrayList userProfileList) {
		this.userProfileList = userProfileList;
	}




	public UserProfile(ArrayList userProfileList) {
		super();
		this.userProfileList = userProfileList;
	}




	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public UserProfile(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		System.out.println("Email :"+email);
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
