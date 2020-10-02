package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLoginPage() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "It works!");
		mv.setViewName("login");
		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView showWelcomePage(@RequestParam String name, @RequestParam String password, @RequestParam String name1, @RequestParam String password1) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",name);
		mv.addObject("password",password);
		mv.addObject("email");
		mv.setViewName("welcome");
		
		UserProfile userProfile = new UserProfile(name, password, "email");
		UserProfile userProfile1 = new UserProfile(name1, password1, "email");
		

		ArrayList<UserProfile> userProfileList = new ArrayList<>();
		
		userProfileList.add(userProfile);
		userProfileList.add(userProfile1);
		
		mv.addObject("userProfileList",userProfileList);
		return mv;
	}
	
}
