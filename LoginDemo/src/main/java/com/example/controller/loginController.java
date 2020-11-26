package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.json.JSONObject;

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

	@RequestMapping(value = "loginUser", method = RequestMethod.POST)
	public @ResponseBody String check(@RequestBody UserTab user,@RequestParam("datatry") String datatry) {
		String enteredPassword = user.getPassword();
		String enteredUsername = user.getUsername();
		System.out.println("data param  " + datatry);
		JSONObject data = new JSONObject();
		UserTab sysUser = userRepositroy.findByUsername(enteredUsername);
		if (enteredPassword.equals(sysUser.getPassword())) {
			if (sysUser.getUserType() == 1) {
				data.put("message", "success");
				data.put("location","clientDash");
				data.put("user", enteredUsername);
			} else {
				data.put("message", "success");
				data.put("location","employeeDash");
				data.put("user", enteredUsername);
			}

		} else {
			data.put("message", "fail");
		}
		String dataString = data.toString();
		return dataString;
	}

	@RequestMapping("/loginUser1")
	ModelAndView check1(@RequestBody UserTab user) {
		System.out.println("Username  " + user.getUsername());
		System.out.println(user.getPassword());
		ModelAndView mv = new ModelAndView();
		String enteredPassword = user.getPassword();
		String enteredUsername = user.getUsername();
		UserTab sysUser = userRepositroy.findByUsername(enteredUsername);
		System.out.println(sysUser.getUsername() + "  " + sysUser.getPassword());
		if (enteredPassword.equals(sysUser.getPassword())) {

			mv.setViewName("success");
			mv.addObject("message", "It works!");
			System.out.println("success");
			return mv;
		} else {
			mv.setViewName("fail");
			System.out.println("fail");
			return mv;
		}
	}

	@RequestMapping(value = "success")
	public String showSuccessPage() {
		return "success";

	}

	@RequestMapping(value = "fail")
	public String showFailPage() {
		return "fail";

	}
	
	@RequestMapping(value = "clientPage")
	public String showClientPage() {
		return "ClientDashboard-New";

	}

	@RequestMapping(value = "employeePage")
	public String showEmployeePage() {
		return "EmployeeDashboard-New";

	}

}
