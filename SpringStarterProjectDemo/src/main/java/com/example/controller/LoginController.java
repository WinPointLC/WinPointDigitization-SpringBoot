package com.example.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.UserProfile;
import com.example.service.UserProfileService;
import com.google.gson.Gson;

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
		mv.setViewName("welcome");
		mv.addObject("userProfileList",userProfileService.getAllUserProfile());
			
		
		return mv;
	}
	
	
	@RequestMapping(value = "welcome_user")
	public String showWelcomeUserPage() {
		return "welcome_user";
		
	}
	
	void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("From PaperAnalysis Servlet");
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
	    String json = "";
	    if(br != null){
	    	json = br.readLine();
	    }    	    
	    Gson gson = new Gson();
	    String jsonString = null;
		
//		User course = gson.fromJson(json, Course.class);
		UserProfileService userProfileService,userProfileService1;
		userProfileService = gson.fromJson(json,UserProfileService.class);
		
        HttpSession session = request.getSession(false);
		
		String userProfile = new UserProfile().getName();// = new ResultHelper().getResultSet(userId, courseId);
		if (userProfile != null) {
	       	jsonString = gson.toJson(userProfile);
	    }
		
//		System.out.println(paperAnalysisWrapper.get);
//	    jsonString = "[" + json1  + "," + json2 + "]";
		
        System.out.println("UserProfileNameString: " + jsonString);
	    PrintWriter writer = response.getWriter();
		writer.println(jsonString);
		writer.flush();
	}
	
}
