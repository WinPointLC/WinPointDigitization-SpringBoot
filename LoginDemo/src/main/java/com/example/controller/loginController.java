package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.UserTab;
import com.example.repository.UserRepositroy;

@Controller
public class loginController {
	@Autowired
	UserRepositroy userRepositroy;

	@RequestMapping("/login")
	public String getPage() {
		return "LoginForm";
	}

	@RequestMapping("/loginUser")
	ModelAndView check(@RequestBody UserTab user) {
		System.out.println("Username  " + user.getUsername());
		System.out.println(user.getPassword());
		ModelAndView mv = new ModelAndView();
		String enteredPassword = user.getPassword();
		String enteredUsername = user.getUsername();
		UserTab sysUser = userRepositroy.findByUsername(enteredUsername);
		System.out.println(sysUser.getUsername()+"  "+ sysUser.getPassword());
		if (enteredPassword.equals( sysUser.getPassword())) {
			mv.setViewName("success");
			System.out.println("success");
			return mv;
		} else {
			mv.setViewName("fail");
			System.out.println("fail");
			return mv;
		}
	}

}
