package com.winpoint.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.winpoint.repository.StreamsRepository;
import com.winpoint.model.EnquiryDetails;
import com.winpoint.model.Streams;
import com.winpoint.model.UserProfile;

@Controller
public class RevenueTrackerController {

	@RequestMapping(value = "/RevenueTracker", method = RequestMethod.GET)
	public ModelAndView showRevenueTrackerPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("MainBatchPage");
		return mv;
	}
	@Autowired
	StreamsRepository stream;
	
	@RequestMapping(value = "PriorityOfCourses", method = RequestMethod.GET)
	public ModelAndView showPriorityOfCoursesScreen() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("PriorityOfCourses");
		List<Streams> c = stream.findAll();
		mv.addObject("streamList", c);		
		return mv;
	}
	
	
	  @RequestMapping(value = "/SignUpRevenueTracker", method = RequestMethod.GET)
	  public ModelAndView showSignUpRevenueTrackerPage() {
		  ModelAndView mv = new ModelAndView();
		  mv.setViewName("SignUpForm"); 
		  List<String> list=new ArrayList<String>();  
		  list.add("MCA");  
		  list.add("BCA");  
		  list.add("BE");  
		  
		  mv.addObject("degreeList",list);	
		  return mv; 
	}
	 
	
	/*
	 * @GetMapping("/SignUpRevenueTracker") public String showForm(@ModelAttribute
	 * EnquiryDetails enquiryDetails) { return "SignUpForm"; }
	 */
	
	@ModelAttribute("enquiryDetails")
	   public  EnquiryDetails getDegreeList() {
		EnquiryDetails user =new EnquiryDetails();
	      
	      return user;
	   }
	
	  
	  @PostMapping("/saveForm") 
	  public String saveForm(EnquiryDetails user,RedirectAttributes redirectAttributes)
	  {
		  System.out.println("USER:  "+ user.getFirstName());
		  System.out.println("USER:  "+ user.getGender());
		  return "redirect:/EnquiryDetails";
		  
	  }
	  
	  @RequestMapping(value = "UpdateForm", method = RequestMethod.GET)
		public ModelAndView showUpdateForm() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("UpdateForm");
			EnquiryDetails user =new EnquiryDetails();
			user.setFirstName("Pragya");
			mv.addObject("user", user);		
			
			return mv;
		}
}