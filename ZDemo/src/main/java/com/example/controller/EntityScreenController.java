package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.CourseType;
import com.example.model.DifficultyLevel;
import com.example.model.EmployeeCategory;
import com.example.model.EvaluationType;
import com.example.model.FeedbackCategory;
import com.example.model.FeedbackQuestionType;
import com.example.model.GradingSystem;
import com.example.model.OrganizationType;
import com.example.model.Streams;
import com.example.repository.CourseTypeRepository;
import com.example.repository.DifficultyLevelRepository;
import com.example.repository.EmployeeCategoryRepository;
import com.example.repository.EvaluationTypeRepository;
import com.example.repository.FeebackCategoryRepository;
import com.example.repository.FeedbackQuestionTypeRepositoy;
import com.example.repository.GradingSystemRepository;
import com.example.repository.OrganizationTypeRepository;
import com.example.repository.ReminderTypeRepository;
import com.example.repository.RevenueTypeRepository;
import com.example.repository.SecurityQuestionsRepository;
import com.example.repository.SegmentTypeRepository;
import com.example.repository.StreamsRepository;
import com.example.repository.TimeSlotsRepository;
import com.example.repository.UserCategoryRepository;

@Controller
public class EntityScreenController {
	@RequestMapping(value = "/Entities", method = RequestMethod.GET)
	public ModelAndView showEntityPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Entities");
		return mv;
	}

	@Autowired
	CourseTypeRepository CourseTypeRepository;

	@Autowired
	DifficultyLevelRepository DifficultyLevelRepository;

	@Autowired
	EmployeeCategoryRepository EmployeeCategoryRepository;

	@Autowired
	EvaluationTypeRepository EvaluationTypeRepository;

	@Autowired
	FeebackCategoryRepository FeedbackCategoryRepository;

	@Autowired
	FeedbackQuestionTypeRepositoy FeedbackQuestionTypeRepositoy;

	@Autowired
	OrganizationTypeRepository OrganizationTypeRepository;

	@Autowired
	GradingSystemRepository GradingSystemRepository;

	@Autowired
	ReminderTypeRepository ReminderTypeRepository;

	@Autowired
	RevenueTypeRepository RevenueTypeRepository;

	@Autowired
	SecurityQuestionsRepository SecurityQuestionsRepository;

	@Autowired
	SegmentTypeRepository SegmentTypeRepository;

	@Autowired
	StreamsRepository StreamsRepository;

	@Autowired
	TimeSlotsRepository TimeSlotsRepository;

	@Autowired
	UserCategoryRepository UserCategoryRepository;

	@RequestMapping(value = "/Entity", method = RequestMethod.POST)
	public @ResponseBody List<?> showCourseType(@RequestParam String entityInfoParam) {
		System.out.println("\n\n\n\n"+entityInfoParam+"\n\n\n\n\n" );
		switch (entityInfoParam) {
		
		case "CourseType":
			System.out.println("\n\n\n\nReached "+entityInfoParam+" here\n\n\n\n");
			return CourseTypeRepository.findAll();
			
		case "DifficultyLevel":
			
			System.out.println(DifficultyLevelRepository.findAll());
			return DifficultyLevelRepository.findAll();
			
		case "Stream":
			System.out.println(StreamsRepository.findAll());
			return StreamsRepository.findAll();

		case "EmployeeCategory":
			System.out.println(EmployeeCategoryRepository.findAll());
			return EmployeeCategoryRepository.findAll();
			
		case "EvaluationType":
			System.out.println(EvaluationTypeRepository.findAll());
			return EvaluationTypeRepository.findAll();

		case "FeedbackCategory":
			System.out.println(FeedbackCategoryRepository.findAll());
			return FeedbackCategoryRepository.findAll();

		case "FeebackQuestionType":
			System.out.println(FeedbackQuestionTypeRepositoy.findAll());
			return FeedbackQuestionTypeRepositoy.findAll();
			
		case "GradingSystem":
			System.out.println(GradingSystemRepository.findAll());
			return GradingSystemRepository.findAll();

		case "OrganizationType":
			System.out.println(OrganizationTypeRepository.findAll());
			return OrganizationTypeRepository.findAll();

		case "ReminderType":
			System.out.println(ReminderTypeRepository.findAll());
			return ReminderTypeRepository.findAll();

		case "RevenueType":
			System.out.println(RevenueTypeRepository.findAll());
			return RevenueTypeRepository.findAll();

		case "SecurityQuestions":
			System.out.println(SecurityQuestionsRepository.findAll());
			return SecurityQuestionsRepository.findAll();
			
		case "SegmentType":
			System.out.println(SegmentTypeRepository.findAll());
			return SegmentTypeRepository.findAll();
			
		case "TimeSlots":
			System.out.println(TimeSlotsRepository.findAll());
			return TimeSlotsRepository.findAll();

		case "UserCategory":
			System.out.println(UserCategoryRepository.findAll());
			return UserCategoryRepository.findAll();	
		
		default:
			return null;
		}

	}
	
	@RequestMapping(value = "/EntityUpdate", method = RequestMethod.POST)
	public void updateCourseType(@RequestParam String entityInfoParam,@RequestParam(value = "addRows")List<CourseType>addRows) {
		System.out.println("\n\n\n\n\n\n\n\n"+entityInfoParam+"\n\n\n\n\n\n\n\n");
		switch (entityInfoParam) {
		
		case "CourseType":
			for(Object x : addRows) {
				CourseType courseType = (CourseType)x;
				CourseTypeRepository.save(courseType);
			}
				
			break;
			
		case "DifficultyLevel":
			
			for(Object x : addRows) {
				DifficultyLevel difficultyLevel = (DifficultyLevel)x;
				DifficultyLevelRepository.save(difficultyLevel);
			}			
			
			break;
			
		case "Stream":
			for(Object x : addRows) {
				Streams streams = (Streams)x;
				StreamsRepository.save(streams);
			}
			break;
		case "EmployeeCategory":
			for(Object x : addRows) {
				EmployeeCategory employeeCategory = (EmployeeCategory)x;
				EmployeeCategoryRepository.save(employeeCategory);
			}
			break;			
		case "EvaluationType":
			for(Object x : addRows) {
				EvaluationType evaluationType = (EvaluationType)x;
				EvaluationTypeRepository.save(evaluationType);
			}
			break;
		case "FeedbackCategory":
			for(Object x : addRows) {
				FeedbackCategory feedbackCategory = (FeedbackCategory)x;
				FeedbackCategoryRepository.save(feedbackCategory);
			}
			break;
		case "FeedbackQuestionType":
			for(Object x : addRows) {
				FeedbackQuestionType feedbackQuestionType = (FeedbackQuestionType)x;
				FeedbackQuestionTypeRepositoy.save(feedbackQuestionType);
			}
			break;			
		case "GradingSystem":
			for(Object x : addRows) {
				GradingSystem gradingSystem = (GradingSystem)x;
				GradingSystemRepository.save(gradingSystem);
			}
			break;
		case "OrganizationType":
			for(Object x : addRows) {
				OrganizationType organizationType = (OrganizationType)x;
				OrganizationTypeRepository.save(organizationType);
			}
			break;
		case "ReminderType":
			System.out.println(ReminderTypeRepository.findAll());
			break;
		case "RevenueType":
			System.out.println(RevenueTypeRepository.findAll());
			break;
		case "SecurityQuestions":
			System.out.println(SecurityQuestionsRepository.findAll());
			break;			
		case "SegmentType":
			System.out.println(SegmentTypeRepository.findAll());
			break;			
		case "TimeSlots":
			System.out.println(TimeSlotsRepository.findAll());
			break;
		case "UserCategory":
			System.out.println(UserCategoryRepository.findAll());
			break;		
		default:
			break;		}

	}

}