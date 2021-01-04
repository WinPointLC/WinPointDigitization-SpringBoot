package com.winpoint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.Course;
import com.winpoint.model.EnquiryDetails;
import com.winpoint.model.Streams;
import com.winpoint.model.StudentCourseDetails;
import com.winpoint.model.UserProfile;
import com.winpoint.repository.StreamsRepository;

@Controller
public class ClientDashBoardController {
	
	@Autowired
	StreamsRepository stream;
	
	
	
	
	

	@RequestMapping(value = "/client", method = RequestMethod.GET)
	public ModelAndView ClientDashboardPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ClientDashboard-New");
		List<Streams> c = stream.findAll();
		System.out.println(c);
		mv.addObject("streamList", c);
		mv.addObject("firstStreamId", c.get(0).getStreamId());
		return mv;
	}
	
	@RequestMapping(value = "/CourseRegistration", method = RequestMethod.GET)
	public ModelAndView CourseRegistrationPage(@RequestParam("userId") String userId) {
		ModelAndView mv = new ModelAndView();
		List<UserProfile> c = new ArrayList<>();
//		mv.addObject("streamList", c);
//		mv.addObject("firstStreamId", c.get(0).getStreamId());
		
		
		stream.findById(1).get().getMappingCourse().stream().forEach(y->y.getMappingStudentCourseDetails().stream().
		filter(x->x.getMappingUserProfile().getUserId()==Integer.parseInt(userId)).forEach(z->c.add(z.getMappingUserProfile())));
		
		
		
		
		mv.setViewName("CourseRegistration");
		System.out.println("**********"+userId);
		return mv;
	}
	
	@RequestMapping(value = "/MainCoursePage", method = RequestMethod.GET)
	public ModelAndView OnlineEvaluationPage() {
		ModelAndView mv = new ModelAndView();
		List<Streams> c = stream.findAll();
		mv.addObject("streamList", c);
		mv.addObject("firstStreamId", c.get(0).getStreamId());
		mv.setViewName("MainCoursePage");	
		return mv;
	}
	
	@RequestMapping(value = "/Analytics", method = RequestMethod.GET)
	public ModelAndView AnalyticsPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Analytics");	
		return mv;
	}

}
