package com.winpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.Streams;
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
		//mv.addObject("firstStreamId", c.get(0).getStreamId());
		return mv;
	}
	
	@RequestMapping(value = "/CourseRegistration", method = RequestMethod.GET)
	public ModelAndView CourseRegistrationPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("CourseRegistration");	
		return mv;
	}
	
	@RequestMapping(value = "/MainCoursePage", method = RequestMethod.GET)
	public ModelAndView OnlineEvaluationPage() {
		ModelAndView mv = new ModelAndView();
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
