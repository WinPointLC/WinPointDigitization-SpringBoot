package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Streams;
import com.example.repository.StreamsRepository;

@Controller
public class EmpDashboardController {
//	@Autowired
//	StreamsRepository stream;
//
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ModelAndView EmpDashboardPage() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("EmployeeDashboard-New");
//		List<Streams> c = stream.findAll();
//		System.out.println(c);
//		mv.addObject("streamList", c);
//		mv.addObject("firstStreamId", c.get(0).getStreamId());
//		return mv;
//	}
	
}
