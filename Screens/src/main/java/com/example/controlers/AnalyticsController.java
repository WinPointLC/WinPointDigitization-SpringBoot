package com.example.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.CourseType;
import com.example.model.Streams;
import com.example.repository.CourseTypeRepository;
import com.example.repository.StreamsRepository;

@Controller
public class AnalyticsController {
	@RequestMapping(value = "Client")
	public String showClientPage() {
		return "ClientDashboard-New";
	}
	
	@RequestMapping(value = "Analytics")
	public String showAnalyticsPage() {
		return "Analytics";
	}
	
	@RequestMapping(value = "TestSelectPage")
	public String showTestPage() {
		return "TestSelectPage";
	}
	
	@RequestMapping(value = "RulesPage")
	public String showRulesPage() {
		return "RulesPage";
	}
	
	@RequestMapping(value = "OesQuestionPage")
	public String showOesQuestionPage() {
		return "OesQuestionPage";
	}
	
	@RequestMapping(value = "Result")
	public String showResultPage() {
		return "Result";
	}
	
	
	
	@RequestMapping(value = "FeedBackForm")
	public ModelAndView showFeedBackFormPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FeedBackForm");
		mv.addObject("firstName", "Pragya");
		mv.addObject("lastName", "Korpal");
		return mv;
	}
	
	
	@Autowired
	StreamsRepository stream;
	@Autowired
	CourseTypeRepository CourseTypeRepository;
	
	@RequestMapping(value = "MainCoursePage", method = RequestMethod.GET)
	public ModelAndView showMainCoursePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("MainCoursePage");
		List<Streams> c = stream.findAll();
		
		mv.addObject("streamList", c);
		mv.addObject("firstStreamId", c.get(0).getStreamId());
		mv.addObject("courseTypesList", CourseTypeRepository.findByStreamId(c.get(0).getStreamId()));
			
		return mv;
	}
	
	@RequestMapping(value = "LectureView", method = RequestMethod.GET)
	public ModelAndView showLectureViewScreen() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LectureView");
		List<Streams> c = stream.findAll();
		
		mv.addObject("streamList", c);
		
			
		return mv;
	}
	
	@RequestMapping(value = "PriorityOfCourses", method = RequestMethod.GET)
	public ModelAndView showPriorityOfCoursesScreen() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("PriorityOfCourses");
		List<Streams> c = stream.findAll();
		mv.addObject("streamList", c);		
		return mv;
	}
	
	@RequestMapping(value = "fs")
	public String showMainBatchPage() {
		return "MainBatchPage";
	}
	
	@RequestMapping(value = "NumberOfStudents")
	public String showNumberOfStudentsPage() {
		return "NumberOfStudents";
	}
	
	@RequestMapping(value = "BatchLaunch")
	public String showBatchLaunchPage() {
		return "BatchLaunch";
	}

	
}
