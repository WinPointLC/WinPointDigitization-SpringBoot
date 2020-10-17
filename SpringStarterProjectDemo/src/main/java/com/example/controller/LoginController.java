package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.repository.ProductRepository;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLoginPage() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "It works!");
		mv.setViewName("login");
		return mv;
	}
//	@Autowired
//	UserProfileService userProfileService;
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public ModelAndView showWelcomePage(@RequestParam String name, @RequestParam String password, @RequestParam String name1, @RequestParam String password1) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name",name);
//		mv.addObject("password",password);
//		mv.addObject("email");
//		mv.setViewName("welcome");
////		mv.addObject("userProfileList",userProfileService.getAllUserProfile());
//			
//		Gson gson = new Gson();
//		System.out.println("Gson Object Created");
//	    String jsonString = "";
//	    System.out.println("jstring Object Created");
//	    
//	    UserProfile userProfile = new UserProfile();// = new ResultHelper().getResultSet(userId, courseId);
//		
//	    if (userProfile != null) {
//	       	jsonString = gson.toJson(userProfile);
//	    }
//	 
//        System.out.println("UserProfileNameString: " + jsonString);
//	   
//	    mv.addObject("userProfile",userProfile);
//		return mv;
//	}
	/*
	 * @Autowired UserProfileService userProfileService;
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = "/add-userProfile1", method = RequestMethod.POST)
	 * public ModelAndView showWelcomePage(@RequestBody UserProfile userProfile) {
	 * ModelAndView mv = new ModelAndView(); // mv.addObject("name",name); //
	 * mv.addObject("password",password); // mv.addObject("email");
	 * 
	 * // mv.addObject("userProfileList",userProfileService.getAllUserProfile());
	 * 
	 * Gson gson = new Gson(); System.out.println("Gson Object Created"); String
	 * jsonString = ""; System.out.println("jstring Object Created");
	 * 
	 * // UserProfile userProfile = new UserProfile();// = new
	 * ResultHelper().getResultSet(userId, courseId);
	 * 
	 * if (userProfile != null) { jsonString = gson.toJson(userProfile); }
	 * 
	 * System.out.println("UserProfileNameString: " + jsonString);
	 * 
	 * // mv.addObject("userProfile",jsonString); JsonParser parser = new
	 * JsonParser(); JsonObject json = (JsonObject) parser.parse(jsonString);
	 * System.out.println("UserProfileNameObject: " + json);
	 * 
	 * 
	 * // mv.setViewName("login"); return mv; }
	 */
	
	@Autowired ProductRepository ProductRepository;
	@RequestMapping(value = "welcome_user")
	public String showWelcomeUserPage() {
		return "welcome_user";
		
	}
}
