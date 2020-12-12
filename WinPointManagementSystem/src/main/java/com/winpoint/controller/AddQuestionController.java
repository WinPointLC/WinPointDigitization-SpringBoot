package com.winpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.DifficultyLevel;
import com.winpoint.repository.DifficultyLevelRepository;
import com.winpoint.repository.StreamsRepository;
//import com.winpoint.repository.TopicsRepository;

@Controller
public class AddQuestionController {
//	@RequestMapping(value = "AddNewQuestion")
//	public String showAddQuestionPage() {
//		return "AddNewQuestion";
//
//	}

	@Autowired
	StreamsRepository stream;

	@RequestMapping(value = "AddNewQuestion", method = RequestMethod.GET)
	public ModelAndView showAddNewQuestionPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("AddNewQuestion");
		mv.addObject("streamList", stream.findAll());
		return mv;
	}

	/*
	 * @Autowired TopicsRepository TopicsRepository;
	 * 
	 * @RequestMapping(value = "/CourseTopicsSelect", method = RequestMethod.POST)
	 * public @ResponseBody List<?> showCourse(@RequestParam("courseId") String
	 * courseId) { return
	 * TopicsRepository.findByCourseId(Integer.parseInt(courseId)); }
	 */

	@Autowired
	DifficultyLevelRepository difficultyLevelRepository;

	@RequestMapping(value = "/DifficultyLevel", method = RequestMethod.POST)
	public @ResponseBody List<DifficultyLevel> showDifficultyLevel() {
		return difficultyLevelRepository.findAll();
	}

}
