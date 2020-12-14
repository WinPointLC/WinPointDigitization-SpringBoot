package com.winpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.service.EnquiryDetailsService;

@Controller
public class EnquiryDetailsController {

	@Autowired
	EnquiryDetailsService enquiryDetailsService;
	
	@RequestMapping(value = "/EnquiryDetails", method = RequestMethod.GET)
	public ModelAndView showEnquiryDetailsPage() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("enquiryList", enquiryDetailsService.enquiryDetailsList());
		mv.setViewName("EnquiryDetails");
		return mv;
	}
	
}
