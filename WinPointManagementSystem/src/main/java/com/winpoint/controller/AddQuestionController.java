package com.winpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.DifficultyLevel;
import com.winpoint.model.GeneralAptitudeQuestionBank;
import com.winpoint.model.SoftSkillsQuestionBank;
import com.winpoint.model.TechnicalQuestionBank;
import com.winpoint.model.Topics;
import com.winpoint.repository.CourseRepository;
import com.winpoint.repository.DifficultyLevelRepository;
import com.winpoint.repository.GeneralAptitudeQuestionBankRepository;
import com.winpoint.repository.SoftSkillsQuestionBankRepository;
import com.winpoint.repository.StreamsRepository;
import com.winpoint.repository.TechnicalQuestionBankRepository;

@Controller
public class AddQuestionController {

	@Autowired
	StreamsRepository stream;
	
	@Autowired
	DifficultyLevelRepository difficultyLevelRepository;

	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	TechnicalQuestionBankRepository technicalQuestionBankRepository;
	
	@Autowired
	SoftSkillsQuestionBankRepository softSkillsQuestionBankRepository;
	
	@Autowired
	GeneralAptitudeQuestionBankRepository generalAptitudeQuestionBankRepository;
	@Autowired
	@RequestMapping(value = "AddNewQuestion", method = RequestMethod.GET)
	public ModelAndView showAddNewQuestionPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("AddNewQuestion");
		mv.addObject("streamList", stream.findAll());
		return mv;
	}

	
	@RequestMapping(value = "/CourseTopicsSelect", method = RequestMethod.POST)
	public @ResponseBody List<Topics> ShowCourseTopics(@RequestParam String courseId) {
		System.out.println("\n\n\n\n\n\n\n\n\nReached\n\n\n\n\n\n\n\n");
		System.out.println(courseRepository.findById(Integer.parseInt(courseId)).get().getMappingTopics().get(0));
		return courseRepository.findById(Integer.parseInt(courseId)).get().getMappingTopics();
	}

	

	@RequestMapping(value = "/DifficultyLevel", method = RequestMethod.POST)
	public @ResponseBody List<DifficultyLevel> showDifficultyLevel() {
		return difficultyLevelRepository.findAll();
	}

	
	@RequestMapping(value = "/technicalQuestionBank", method = RequestMethod.POST)
	public void AddTechnicalQuestion(@RequestBody TechnicalQuestionBank technicalQuestionBank) {
		System.out.println("\n\n\n\n\n\n");
		System.out.println(technicalQuestionBank.getMappingCourse().getCourseName());
		System.out.println(technicalQuestionBank.getMappingDifficultyLevel());
		System.out.println(technicalQuestionBank.getMappingTopics());
		technicalQuestionBankRepository.save(technicalQuestionBank);
		System.out.println("\n\n\n\n\n\n\n\nReached\n\n\n\n\n\n");
	}
	
	
	@RequestMapping(value = "/softskillsQuestionBank", method = RequestMethod.POST)
	public void AddSoftSkillsQuestion(@RequestBody SoftSkillsQuestionBank softSkillsQuestionBank) {
		softSkillsQuestionBankRepository.save(softSkillsQuestionBank);
	}
	
	
	@RequestMapping(value = "/generalaptitudeQuestionBank", method = RequestMethod.POST)
	public void AddGeneralAptitudeQuestion(@RequestBody GeneralAptitudeQuestionBank generalAptitudeQuestionBank) {
		generalAptitudeQuestionBankRepository.save(generalAptitudeQuestionBank);
	}
}
