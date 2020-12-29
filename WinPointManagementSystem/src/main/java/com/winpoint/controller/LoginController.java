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
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView LoginPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LoginForm");	
		return mv;
	}
	

}
