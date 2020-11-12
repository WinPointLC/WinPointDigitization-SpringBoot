package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.repository.UserRepositroy;

@Controller
public class loginController {
	@Autowired UserRepositroy userRepositroy;

	@RequestMapping("/loginUser")
	ModelAndView check(@RequestParam String username,@RequestParam String password ) {
		ModelAndView mv = new ModelAndView();
		if(password == userRepositroy.findByUsername(username).getPassword()) {
			
			mv.setViewName("success");
			return mv;
		}
		else {
			mv.setViewName("fail");
			return mv;
		}
	}
}
