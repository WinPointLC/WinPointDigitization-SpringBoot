package com.demo.controller;

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
		mv.addObject("Message", "It works!");
		mv.setViewName("login");
		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView showWelcomePage(@RequestParam("name") String na, @RequestParam String password) {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("name",na);
		mv.addObject("password",password);
		mv.setViewName("welcome");
		return mv;
	}

	
}
