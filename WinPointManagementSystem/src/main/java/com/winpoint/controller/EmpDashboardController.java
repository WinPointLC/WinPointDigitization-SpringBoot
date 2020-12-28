package com.winpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.Streams;
import com.winpoint.repository.CourseTypeRepository;
import com.winpoint.repository.StreamsRepository;

@Controller
public class EmpDashboardController {
	
	
	@Autowired
	StreamsRepository stream;
	@Autowired 
	CourseTypeRepository CourseTypeRepository;

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView EmpDashboardPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeDashboard-New");
		List<Streams> c = stream.findAll();
		System.out.println(c);
		mv.addObject("streamList", c);
		//mv.addObject("firstStreamId", c.get(0).getStreamId());
		return mv;
	}
	
}
