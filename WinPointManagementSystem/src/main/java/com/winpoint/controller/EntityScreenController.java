package com.winpoint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.CourseType;
import com.winpoint.model.DifficultyLevel;
import com.winpoint.model.EmployeeCategory;
import com.winpoint.model.EvaluationType;
import com.winpoint.model.FeedbackCategory;
import com.winpoint.model.FeedbackQuestionType;
import com.winpoint.model.GradingSystem;
import com.winpoint.model.OrganizationType;
import com.winpoint.model.PaymentMode;
import com.winpoint.model.ReminderType;
import com.winpoint.model.RevenueType;
import com.winpoint.model.SecurityQuestions;
import com.winpoint.model.SegmentType;
import com.winpoint.model.Streams;
import com.winpoint.model.TimeSlots;
import com.winpoint.model.UserCategory;
import com.winpoint.repository.CourseTypeRepository;
import com.winpoint.repository.DifficultyLevelRepository;
import com.winpoint.repository.EmployeeCategoryRepository;
import com.winpoint.repository.EvaluationTypeRepository;
import com.winpoint.repository.FeebackCategoryRepository;
import com.winpoint.repository.FeedbackQuestionTypeRepositoy;
import com.winpoint.repository.GradingSystemRepository;
import com.winpoint.repository.OrganizationTypeRepository;
import com.winpoint.repository.PaymentModeRepository;
import com.winpoint.repository.ReminderTypeRepository;
import com.winpoint.repository.RevenueTypeRepository;
import com.winpoint.repository.SecurityQuestionsRepository;
import com.winpoint.repository.SegmentTypeRepository;
import com.winpoint.repository.StreamsRepository;
import com.winpoint.repository.TimeSlotsRepository;
import com.winpoint.repository.UserCategoryRepository;

@Controller
public class EntityScreenController {
	@RequestMapping(value = "/Entities", method = RequestMethod.GET)
	public ModelAndView showEntityPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Entities");
		return mv;
	}

	@Autowired
	CourseTypeRepository courseTypeRepository;

	@Autowired
	DifficultyLevelRepository difficultyLevelRepository;

	@Autowired
	EmployeeCategoryRepository employeeCategoryRepository;

	@Autowired
	EvaluationTypeRepository evaluationTypeRepository;

	@Autowired
	FeebackCategoryRepository feedbackCategoryRepository;

	@Autowired
	FeedbackQuestionTypeRepositoy feedbackQuestionTypeRepositoy;

	@Autowired
	OrganizationTypeRepository organizationTypeRepository;

	@Autowired
	GradingSystemRepository gradingSystemRepository;

	@Autowired
	ReminderTypeRepository reminderTypeRepository;

	@Autowired
	RevenueTypeRepository revenueTypeRepository;

	@Autowired
	SecurityQuestionsRepository securityQuestionsRepository;

	@Autowired
	SegmentTypeRepository segmentTypeRepository;

	@Autowired
	StreamsRepository streamsRepository;

	@Autowired
	TimeSlotsRepository timeSlotsRepository;

	@Autowired
	UserCategoryRepository userCategoryRepository;

	@Autowired
	PaymentModeRepository paymentModeRepository;

	@RequestMapping(value = "/Entity", method = RequestMethod.POST)
	public @ResponseBody List<?> showCourseType(@RequestParam String entityInfoParam) {
		List<?>list ;
		switch (entityInfoParam) {
		case "CourseType":
			list = courseTypeRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<CourseType> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new CourseType());
				for(CourseType x:empList)
					System.out.println(x);
				return empList;
			}
			return list;

		case "DifficultyLevel":
			list = null;
			list = difficultyLevelRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<DifficultyLevel> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new DifficultyLevel());
				for(DifficultyLevel x:empList)
					System.out.println(x);
				return empList;
			}
			return list;

		case "Stream":
			list = streamsRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<Streams> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new Streams());
				for(Streams x:empList)
					System.out.println(x);
				return empList;
			}
			return list;

		case "EmployeeCategory":
			System.out.println(employeeCategoryRepository.findAll());
			return employeeCategoryRepository.findAll();

		case "EvaluationType":
			System.out.println(evaluationTypeRepository.findAll());
			return evaluationTypeRepository.findAll();

		case "FeedbackCategory":
			System.out.println(feedbackCategoryRepository.findAll());
			return feedbackCategoryRepository.findAll();

		case "FeebackQuestionType":
			System.out.println(feedbackQuestionTypeRepositoy.findAll());
			return feedbackQuestionTypeRepositoy.findAll();

		case "GradingSystem":
			System.out.println(gradingSystemRepository.findAll());
			return gradingSystemRepository.findAll();

		case "OrganizationType":
			System.out.println(organizationTypeRepository.findAll());
			return organizationTypeRepository.findAll();

		case "PaymentType":
			return paymentModeRepository.findAll();

		case "ReminderType":
			System.out.println(reminderTypeRepository.findAll());
			return reminderTypeRepository.findAll();

		case "RevenueType":
			System.out.println(revenueTypeRepository.findAll());
			return revenueTypeRepository.findAll();

		case "SecurityQuestions":
			System.out.println(securityQuestionsRepository.findAll());
			return securityQuestionsRepository.findAll();

		case "SegmentType":
			System.out.println(segmentTypeRepository.findAll());
			return segmentTypeRepository.findAll();

		case "TimeSlots":
			System.out.println(timeSlotsRepository.findAll());
			return timeSlotsRepository.findAll();

		case "UserCategory":
			System.out.println(userCategoryRepository.findAll());
			return userCategoryRepository.findAll();

		default:
			return null;
		}

	}
	
	
	/////////////////////////////////////////////////////////////////////////////

	@RequestMapping(value = "/CourseTypeUpdate", method = RequestMethod.POST)
	public void updateCourseType(@RequestBody CourseType addRows[]) {
		for (CourseType courseType : addRows) {
//			System.out.println(courseType);
			courseTypeRepository.save(courseType);

		}
	}

	@RequestMapping(value = "/DifficultyLevelUpdate", method = RequestMethod.POST)
	public void updateDifficultyLevel(@RequestBody DifficultyLevel addRows[]) {
		for (DifficultyLevel difficultyLevel : addRows) {
			System.out.println(difficultyLevel);
			difficultyLevelRepository.save(difficultyLevel);
		}
	}

	@RequestMapping(value = "/StreamUpdate", method = RequestMethod.POST)
	public void updateStream(@RequestBody Streams addRows[]) {
		for (Streams stream : addRows) {
			System.out.println(stream);
			streamsRepository.save(stream);
		}
	}

	@RequestMapping(value = "/EmployeeCategoryUpdate", method = RequestMethod.POST)
	public void updateEmployeeCategory(@RequestBody EmployeeCategory addRows[]) {
		for (EmployeeCategory EmployeeCategory : addRows) {
			System.out.println(EmployeeCategory);
			employeeCategoryRepository.save(EmployeeCategory);
		}
	}

	@RequestMapping(value = "/EvaluationTypeUpdate", method = RequestMethod.POST)
	public void updateEvaluationType(@RequestBody EvaluationType addRows[]) {
		for (EvaluationType EvaluationType : addRows) {
			System.out.println(EvaluationType);
			evaluationTypeRepository.save(EvaluationType);
		}
	}

	@RequestMapping(value = "/FeedbackCategoryUpdate", method = RequestMethod.POST)
	public void updateFeedbackCategory(@RequestBody FeedbackCategory addRows[]) {
		for (FeedbackCategory FeedbackCategory : addRows) {
			System.out.println(FeedbackCategory);
			feedbackCategoryRepository.save(FeedbackCategory);
		}
	}

	@RequestMapping(value = "/FeedbackQuestionTypeUpdate", method = RequestMethod.POST)
	public void updateFeedbackQuestionType(@RequestBody FeedbackQuestionType addRows[]) {
		for (FeedbackQuestionType FeedbackQuestionType : addRows) {
			System.out.println(FeedbackQuestionType);
			feedbackQuestionTypeRepositoy.save(FeedbackQuestionType);
		}
	}

	@RequestMapping(value = "/GradingSystemUpdate", method = RequestMethod.POST)
	public void updateGradingSystem(@RequestBody GradingSystem addRows[]) {
		for (GradingSystem gradingSystem : addRows) {
			System.out.println(gradingSystem);
			gradingSystemRepository.save(gradingSystem);
		}
	}

	@RequestMapping(value = "/OrganizationTypeUpdate", method = RequestMethod.POST)
	public void updateOrganizationType(@RequestBody OrganizationType addRows[]) {
		for (OrganizationType organizationType : addRows) {
			System.out.println(organizationType);
			organizationTypeRepository.save(organizationType);
		}
	}
	
	@RequestMapping(value = "/PaymentTypeUpdate", method = RequestMethod.POST)
	public void updatePaymentType(@RequestBody PaymentMode addRows[]) {
		for (PaymentMode paymentMode : addRows) {
			System.out.println(paymentMode);
			paymentModeRepository.save(paymentMode);
		}
	}

	@RequestMapping(value = "/ReminderTypeUpdate", method = RequestMethod.POST)
	public void updateReminderType(@RequestBody ReminderType addRows[]) {
		for (ReminderType reminderType : addRows) {
			System.out.println(reminderType);
			reminderTypeRepository.save(reminderType);
		}
	}

	@RequestMapping(value = "/RevenueTypeUpdate", method = RequestMethod.POST)
	public void updateRevenueType(@RequestBody RevenueType addRows[]) {
		for (RevenueType revenueType : addRows) {
			System.out.println(revenueType);
			revenueTypeRepository.save(revenueType);
		}
	}

	@RequestMapping(value = "/SecurityQuestionsUpdate", method = RequestMethod.POST)
	public void updateSecurityQuestions(@RequestBody SecurityQuestions addRows[]) {
		for (SecurityQuestions securityQuestions : addRows) {
			System.out.println(securityQuestions);
			securityQuestionsRepository.save(securityQuestions);
		}
	}

	@RequestMapping(value = "/SegmentTypeUpdate", method = RequestMethod.POST)
	public void updateSegmentType(@RequestBody SegmentType addRows[]) {
		for (SegmentType segmentType : addRows) {
			System.out.println(segmentType);
			segmentTypeRepository.save(segmentType);
		}
	}

	@RequestMapping(value = "/TimeSlotsUpdate", method = RequestMethod.POST)
	public void updateTimeSlots(@RequestBody TimeSlots addRows[]) {
		for (TimeSlots TimeSlots : addRows) {
			System.out.println(TimeSlots);
			timeSlotsRepository.save(TimeSlots);
		}
	}

	@RequestMapping(value = "/UserCategoryUpdate", method = RequestMethod.POST)
	public void updateUserCategory(@RequestBody UserCategory addRows[]) {
		for (UserCategory userCategory : addRows) {
			System.out.println(userCategory);
			userCategoryRepository.save(userCategory);
		}
	}

}
