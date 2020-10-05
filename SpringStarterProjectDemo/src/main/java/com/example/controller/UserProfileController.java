package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.UserProfile;
import com.example.service.UserProfileService;


@Controller
@Component
public class UserProfileController {

	@Autowired
	private UserProfileService userProfileService;
	@RequestMapping("/")    
	public List<UserProfile> getAllStudents()  
	{    
		System.out.println("From getAllUserProfile");
		return userProfileService.getAllUserProfile();    
	}       
	@RequestMapping(value="/add-userProfile", method=RequestMethod.POST)    
	public void addStudent(@RequestBody UserProfile userProfile)  
	{    
		System.out.println("From addUserProfile");
		userProfileService.addUserProfile(userProfile);    
	}     
}

