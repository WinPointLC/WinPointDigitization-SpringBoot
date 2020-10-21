package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.EnquiryDetails;
import com.example.repository.EnquiryDetailsRepository;

@Service
public class EnquiyDetailsService {

	@Autowired
	EnquiryDetailsRepository enquiryDetailsRepository;

	public void addEnquiryDetails(EnquiryDetails enquiryDetails) {
		enquiryDetailsRepository.save(enquiryDetails);
	}

	public @ResponseBody List<EnquiryDetails> displayEnquiryDetails() {
		return enquiryDetailsRepository.findAll();
	}

}
