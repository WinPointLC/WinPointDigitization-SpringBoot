package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.EnquiryDetails;
import com.example.repository.EnquiryDetailsRepository;

@Controller()
public class EnquiryDetailsController {
	@Autowired
	EnquiryDetailsRepository enquiryDetailsRepository;
//	EnquiyDetailsService enquiryDetailsService;

	@RequestMapping(name = "/detJo")
	public void addEnquiDetails(@RequestBody EnquiryDetails enquiryDetails) {
		enquiryDetailsRepository.addEnquiryDetails(enquiryDetails);
	}

	@RequestMapping(name = "/namJo")
	public List<EnquiryDetails> displayEnquirie() {
		return enquiryDetailsRepository.displayEnquiryDetails();
	}
}
