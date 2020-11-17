package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.User;
import com.example.repository.UserRepositroy;

@Controller
public class loginController {
	@Autowired
	UserRepositroy userRepositroy;

	@RequestMapping("/login")
	public String getPage(@ModelAttribute User user) {
		return "login";
	}

	@RequestMapping("/loginUser")
	ModelAndView check(@RequestBody User user) {
		ModelAndView mv = new ModelAndView();
		if (user == userRepositroy.findByUsername(userRepositroy.findByUsername(user.getUsername()).getPassword())) {

			mv.setViewName("success");
			return mv;
		} else {
			mv.setViewName("fail");
			return mv;
		}
	}
}
