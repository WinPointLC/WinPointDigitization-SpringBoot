package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "UserTable")
public class UserProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String password;
	String email = "email";
	
	
	
//	ArrayList <?> userProfileList;
	
//	public ArrayList<?> getUserProfileList() {
//		return userProfileList;
//	}




//	public void setUserProfileList(ArrayList <?>userProfileList) {
//		this.userProfileList = userProfileList;
//	}




//	public UserProfile(ArrayList<UserProfile> userProfileList) {
//		super();
//		this.userProfileList = userProfileList;
//		for(UserProfile userProfile : userProfileList) {
//			System.out.println("DATA : "+userProfile);
//		}
//	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public UserProfile() {

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




	@Override
	public String toString() {
		return "UserProfile [id = "+id+" , name = "+password+", password = "+password+" , email = "+email+ "]";
	}
	
	
	
}
