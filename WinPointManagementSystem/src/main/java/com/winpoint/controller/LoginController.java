package com.winpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.EnquiryDetails;
import com.winpoint.model.UserProfile;
import com.winpoint.repository.EnquiryDetailsRepository;
import com.winpoint.repository.UserProfileRepository;



@Controller
public class LoginController {
	
	@Autowired
	UserProfileRepository userProfileRepositroy;
	
	@Autowired
	EnquiryDetailsRepository enquiryDetailsRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView LoginPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LoginForm");	
		return mv;
	}
	
	
	@RequestMapping(value = "loginUser", method = RequestMethod.POST)
	public @ResponseBody Object check(@RequestParam String username,@RequestParam String password) {
		System.out.println("HERE LOGIN CONTROLLER");
		
		System.out.println("username : "+username);
		System.out.println("password : "+password);
		System.out.println("!!!!!!");
//		System.out.println(enquiryDetailsRepository.findByEmailId(username).get(0));
		System.out.println("!!!!!!");

		if(enquiryDetailsRepository.findByEmailId(username).isEmpty()) {
			
			UserProfile userObject = userProfileRepositroy.findByEmailId(username).get(0);
			System.out.println("password : "+password);
			System.out.println("database password : "+userObject.getPassword());
//			System.out.println("Enquired : "+userObject.getEnquired());
			if (password.equals(userObject.getPassword())) {
				return userObject;
			} 
			else {
				return null;
			}
		}
		else {
			System.out.println("entered");
			EnquiryDetails enquiryDetails = enquiryDetailsRepository.findByEmailId(username).get(0);
			System.out.println("password : "+password);
			System.out.println("database password : "+enquiryDetails.getDefaultPassword());
			System.out.println("Enquired : "+enquiryDetails.isEnquired());
			if(password.equals(enquiryDetails.getDefaultPassword())) {
				return enquiryDetails;
			}
			else {
				return null;
			}
		}
	}
}
