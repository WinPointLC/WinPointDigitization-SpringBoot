package com.winpoint.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winpoint.model.EnquiryDetails;
import com.winpoint.repository.EnquiryDetailsRepository;

@Service
public class EnquiryDetailsService {

	@Autowired
	EnquiryDetailsRepository enquiryDetailsRepository;
	
	public List<EnquiryDetails> enquiryDetailsList() {
		return enquiryDetailsRepository.findAll();
	}
	
}

