package com.winpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping(value = "User", method = RequestMethod.GET)
	public ModelAndView showUserProfilePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("User");
		return mv;
	}

}
