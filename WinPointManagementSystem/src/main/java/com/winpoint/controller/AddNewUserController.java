package com.winpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.SecurityQuestions;
import com.winpoint.model.SegmentType;
import com.winpoint.model.TimeSlots;
import com.winpoint.model.UserProfile;
import com.winpoint.repository.SecurityQuestionsRepository;
import com.winpoint.repository.SegmentTypeRepository;
import com.winpoint.repository.TimeSlotsRepository;
import com.winpoint.repository.UserProfileRepository;

@Controller
public class AddNewUserController {
	
	@Autowired
	SegmentTypeRepository segmentTypeRepository;
	
	@Autowired
	TimeSlotsRepository timeSlotsRepository;
	
	@RequestMapping(value = "/AddNewUser", method = RequestMethod.GET)
	public ModelAndView showAddNewUserPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("AddNewUser");
		List<SecurityQuestions> securityQuestionsList = securityQuestionsRepository.findAll();
		List<SegmentType> segmentTypeList = segmentTypeRepository.findAll();
		List<TimeSlots> availableTimeList = timeSlotsRepository.findAll();
		mv.addObject("securityQuestions", securityQuestionsList);
		mv.addObject("availableTimeList", availableTimeList);
		mv.addObject("segmentTypeList", segmentTypeList);
		return mv;
	}
	
	@Autowired
	UserProfileRepository userProfileRepository;
	@Autowired
	SecurityQuestionsRepository securityQuestionsRepository;


	@RequestMapping("/saveNewUser")
	public void saveForm(@RequestBody UserProfile userProfile){
		System.out.println("USER:  " + userProfile.getFirstName());
		System.out.println("USER:  " + userProfile.getGender());
		
		System.out.println("USER:  " + userProfile.getMappingSecurityQuestions());	
		System.out.println("USER:  " + userProfile.getMappingTimeSlots());	
		System.out.println("USER:  " + userProfile.getMappingSegmentType());
		System.out.println("USER:  " + userProfile.getMappingUserCategory());
		
		userProfileRepository.save(userProfile);


	}
	

}
