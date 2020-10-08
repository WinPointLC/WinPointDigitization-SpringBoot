package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView addStudent(@RequestBody UserProfile userProfile)  
	{   
//		@RequestBody UserProfile userProfile
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome_user");
		userProfileService.addUserProfile(userProfile);
		UserProfile userObj = new UserProfile();
		userObj.setEmail("aay@gmail.com");
		userObj.setId(2);
		userObj.setName("pragya");
		userObj.setPassword("wbidb3idwi");
//		mv.addObject("");
		return mv;
	}     
}


