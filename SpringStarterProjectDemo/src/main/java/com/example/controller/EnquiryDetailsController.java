package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.EnquiryDetails;
import com.example.service.EnquiyDetailsService;

@Controller()
public class EnquiryDetailsController {
	@Autowired
	EnquiyDetailsService enquiryDetailsService;

//	@RequestMapping(name = "/addEnquiryDetail")
//	public void addEnquiDetails(@RequestBody EnquiryDetails enquiryDetails) {
//		enquiryDetailsService.addEnquiryDetails(enquiryDetails);
//	}
//
//	@RequestMapping(name = "/displayEnquiryDetails")
//	public List<EnquiryDetails> displayEnquirie() {
//		return enquiryDetailsService.displayEnquiryDetails();
//	}
}
