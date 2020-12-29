package com.winpoint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.Course;
import com.winpoint.model.EnquiryDetails;
import com.winpoint.model.SegmentType;
import com.winpoint.model.TimeSlots;
import com.winpoint.model.UserProfile;
import com.winpoint.repository.CourseRepository;
import com.winpoint.repository.SegmentTypeRepository;
import com.winpoint.repository.TimeSlotsRepository;

@Controller
public class SignUpFormController {

	@Autowired
	SegmentTypeRepository segmentTypeRepository;
	@Autowired
	CourseRepository courseRepository;
	@Autowired
	TimeSlotsRepository timeSlotsRepository;
	
	
	@RequestMapping(value = "/SignupForm", method = RequestMethod.GET)
	public ModelAndView showSignUpRevenueTrackerPage(@ModelAttribute EnquiryDetails enquiryDetails,@ModelAttribute TimeSlots timeSlots,@ModelAttribute SegmentType segmentType,@ModelAttribute UserProfile userProfile) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("SignUpForm");
		List<String> list = new ArrayList<String>();
		list.add("MCA");
		list.add("BCA");
		list.add("BE");

		// Segment type dd
		List<SegmentType> segmentTypeList = segmentTypeRepository.findAll();
		List<String> segmentlist = new ArrayList<String>();
		for (SegmentType s : segmentTypeList) {
			System.out.println("DATA segemnt type - " + s.getSegmentTypeName());
			segmentlist.add(s.getSegmentTypeName());

		}
		mv.addObject("segmentTypeList", segmentTypeList);

		// Course already done
		List<Course> courseAlreadyDone = courseRepository.findAll();
		List<String> courseAlreadyDonelist = new ArrayList<String>();
		for (Course s : courseAlreadyDone) {
			System.out.println("DATA segemnt type - " + s.getCourseName());
			courseAlreadyDonelist.add(s.getCourseName());
		}
		mv.addObject("courseAlreadyDone", courseAlreadyDone);
		// Course Interested in
		List<Course> courseInterestedInList = courseRepository.findAll();
		List<String> courseInterestedInlist = new ArrayList<String>();
		for (Course s : courseInterestedInList) {
			System.out.println("DATA segemnt type - " + s.getCourseName());
			courseInterestedInlist.add(s.getCourseName());
		}
		mv.addObject("courseInterestedInList", courseInterestedInList);
		// Available time
		List<TimeSlots> availableTimeList = timeSlotsRepository.findAll();
//		List<String> availableTimelist = new ArrayList<String>();
//		for (TimeSlots s : availableTimeList) {
//			System.out.println("DATA segement type - " + s.getTimeSlotsDescription());
//			availableTimelist.add(s.getTimeSlotsDescription());
//		}
		mv.addObject("availableTimeList", availableTimeList);
		mv.addObject("location", "LoginForm");

		mv.addObject("degreeList", list);
		return mv;
	
	
	}

}
