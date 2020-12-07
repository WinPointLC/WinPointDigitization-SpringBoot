package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.CourseType;
import com.example.repository.StreamsRepository;
import com.example.service.CourseTypeService;

@Controller
public class AllUserController {
	
	@Autowired
	StreamsRepository StreamsRepository;
	
	@RequestMapping(value = "AllUser", method = RequestMethod.GET)
	public ModelAndView showAllUserPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("AllUser");
		mv.addObject("streamList", StreamsRepository.findAll());
		return mv;
	}
	
	@Autowired
	CourseTypeService courseTypeService;

	@RequestMapping(value = "/StreamCourseType", method = RequestMethod.POST)
	public @ResponseBody List<CourseType> showCourseType(@RequestParam("streamId") String streamId) {
		return courseTypeService.CourseTypeList(Integer.parseInt(streamId));
	}
}
