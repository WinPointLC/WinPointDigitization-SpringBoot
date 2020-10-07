package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.UserProfileService;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLoginPage() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "It works!");
		mv.setViewName("login");
		return mv;
	}
	@Autowired
	UserProfileService userProfileService;
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView showWelcomePage(@RequestParam String name, @RequestParam String password, @RequestParam String name1, @RequestParam String password1) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",name);
		mv.addObject("password",password);
		mv.addObject("email");
		mv.setViewName("welcome_user");
		mv.addObject("userProfileList",userProfileService.getAllUserProfile());
		return mv;
	}
	
	
	@RequestMapping(value = "welcome_user")
	public String showWelcomeUserPage() {
		return "welcome_user";
		
	}
	
}
