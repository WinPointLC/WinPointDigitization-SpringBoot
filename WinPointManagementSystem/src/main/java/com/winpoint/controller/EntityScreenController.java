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

import com.winpoint.model.Course;
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
import com.winpoint.repository.CourseRepository;
import com.winpoint.repository.CourseTypeRepository;
import com.winpoint.repository.DifficultyLevelRepository;
import com.winpoint.repository.EmployeeCategoryRepository;
import com.winpoint.repository.EvaluationTypeRepository;
import com.winpoint.repository.FeedbackCategoryRepository;
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
	FeedbackCategoryRepository feedbackCategoryRepository;

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
	
	@Autowired
	CourseRepository courseRepository;

	@RequestMapping(value = "/Entity", method = RequestMethod.POST)
	public @ResponseBody List<?> showCourseType(@RequestParam String entityInfoParam) {
		List<?>list ;
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("EntityInfoParam : "+entityInfoParam);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		switch (entityInfoParam) {
		case "CourseType":
			List<CourseType> list1 = courseTypeRepository.findAll();
			if(list1.isEmpty()) {
				List<CourseType> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new CourseType());
				for(CourseType x:empList)
					System.out.println(x);
				return empList;
			}
			
			return list1;

		case "DifficultyLevel":
			System.out.println("@##############################################################");


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
			System.out.println(list);
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
			System.out.println("@##############################################################");
			list = employeeCategoryRepository.findAll();
			System.out.println(list +" - "+ list.isEmpty());
			if(list.isEmpty()) {
				List<EmployeeCategory> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new EmployeeCategory());
				for(EmployeeCategory x:empList)
					System.out.println(x);
				return empList;
			}
			System.out.println(list);
			return list;

		case "EvaluationType":
			
			list = evaluationTypeRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<EvaluationType> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new EvaluationType());
				for(EvaluationType x:empList)
					System.out.println(x);
				return empList;
			}
			return list;

		case "FeedbackCategory":
			
			list = feedbackCategoryRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<FeedbackCategory> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new FeedbackCategory());
				for(FeedbackCategory x:empList)
					System.out.println(x);
				return empList;
			}
			return list;

		case "FeedbackQuestionType":
			
			list = feedbackQuestionTypeRepositoy.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<FeedbackQuestionType> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new FeedbackQuestionType());
				for(FeedbackQuestionType x:empList)
					System.out.println(x);
				return empList;
			}
			return list;


		case "GradingSystem":
			
			list = gradingSystemRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<GradingSystem> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new GradingSystem());
				for(GradingSystem x:empList)
					System.out.println(x);
				return empList;
			}
			return list;

		case "OrganizationType":
			
			list = organizationTypeRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<OrganizationType> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new OrganizationType());
				for(OrganizationType x:empList)
					System.out.println(x);
				return empList;
			}
			return list;

		case "PaymentType":
			
			list = paymentModeRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<PaymentMode> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new PaymentMode());
				for(PaymentMode x:empList)
					System.out.println(x);
				return empList;
			}
			return list;

		case "ReminderType":
			
			list = reminderTypeRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<ReminderType> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new ReminderType());
				for(ReminderType x:empList)
					System.out.println(x);
				return empList;
			}
			return list;

		case "RevenueType":
			
			list = revenueTypeRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<RevenueType> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new RevenueType());
				for(RevenueType x:empList)
					System.out.println(x);
				return empList;
			}
			return list;

		case "SecurityQuestions":
			
			list = securityQuestionsRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<SecurityQuestions> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new SecurityQuestions());
				for(SecurityQuestions x:empList)
					System.out.println(x);
				return empList;
			}
			return list;

		case "SegmentType":
			
			list = segmentTypeRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<SegmentType> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new SegmentType());
				for(SegmentType x:empList)
					System.out.println(x);
				return empList;
			}
			return list;

		case "TimeSlots":
			
			list = timeSlotsRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<TimeSlots> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new TimeSlots());
				for(TimeSlots x:empList)
					System.out.println(x);
				return empList;
			}
			return list;

		case "UserCategory":
			
			list = userCategoryRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<UserCategory> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new UserCategory());
				for(UserCategory x:empList)
					System.out.println(x);
				return empList;
			}
			return list;
			
		case "Course":
			
			list = courseRepository.findAll();
			System.out.println(list +" "+ list.isEmpty());
			if(list.isEmpty()) {
				List<Course> empList = new ArrayList<>();
				System.out.println("\n\n\n\n\n\n\n\nWelcome \n\n\n\n\n\n\n\n");
				empList.add(new Course());
				for(Course x:empList)
					System.out.println(x);
				return empList;
			}
			return list;

		default:
			return null;
		}

	}
	
	

	@RequestMapping(value = "/CourseTypeUpdate", method = RequestMethod.POST)
	public void updateCourseType(@RequestBody CourseType addRows[]) {
		System.out.println("!!!!!!!!!!!!!!!!@@@@@@@@@@@@@@@@@@@@@@!!!!!!!!!!!!");
		for (CourseType courseType : addRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(courseType);
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
	//###################################################################################
	//###################################################################################
	//###################################################################################
	//Delete
	
	@RequestMapping(value = "/CourseTypeDelete", method = RequestMethod.POST)
	public void deleteCourseType(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			courseTypeRepository.deleteById(item);
		}
	}
	
	@RequestMapping(value = "/DifficutyLevelDelete", method = RequestMethod.POST)
	public void deleteDifficutyLevel(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			difficultyLevelRepository.deleteById(item);
		}
	}
	
	@RequestMapping(value = "/EmployeeCategoryRepositoryDelete", method = RequestMethod.POST)
	public void deleteEmployeeCategoryRepository(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			employeeCategoryRepository.deleteById(item);
		}
	}

	@RequestMapping(value = "/EvaluationTypeRepositoryDelete", method = RequestMethod.POST)
	public void deleteEvaluationTypeRepository(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			evaluationTypeRepository.deleteById(item);
		}
	}
	
	@RequestMapping(value = "/FeebackCategoryRepositoryDelete", method = RequestMethod.POST)
	public void deleteFeebackCategoryRepository(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			feedbackCategoryRepository.deleteById(item);
		}
	}

	@RequestMapping(value = "/FeedbackQuestionTypeRepositoyDelete", method = RequestMethod.POST)
	public void deleteFeedbackQuestionTypeRepositoy(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			feedbackQuestionTypeRepositoy.deleteById(item);
		}
	}
	
	@RequestMapping(value = "/OrganizationTypeRepositoryDelete", method = RequestMethod.POST)
	public void deleteOrganizationTypeRepository(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			organizationTypeRepository.deleteById(item);
		}
	}
	
	@RequestMapping(value = "/GradingSystemRepositoryDelete", method = RequestMethod.POST)
	public void deleteGradingSystemRepository(@RequestBody String delRows[]) {
		for (String item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			gradingSystemRepository.deleteById(item);
		}
	}
	
	@RequestMapping(value = "/ReminderTypeRepositoryDelete", method = RequestMethod.POST)
	public void deleteReminderTypeRepository(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			reminderTypeRepository.deleteById(item);
		}
	}
	
	@RequestMapping(value = "/RevenueTypeRepositoryDelete", method = RequestMethod.POST)
	public void deleteRevenueTypeRepository(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			revenueTypeRepository.deleteById(item);
		}
	}
	
	@RequestMapping(value = "/SecurityQuestionsRepositoryDelete", method = RequestMethod.POST)
	public void deleteSecurityQuestionsRepository(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			securityQuestionsRepository.deleteById(item);
		}
	}
	
	@RequestMapping(value = "/SegmentTypeRepositoryDelete", method = RequestMethod.POST)
	public void deleteSegmentTypeRepository(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			segmentTypeRepository.deleteById(item);
		}
	}
	
	@RequestMapping(value = "/StreamsRepositoryDelete", method = RequestMethod.POST)
	public void deleteStreamsRepository(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			streamsRepository.deleteById(item);
		}
	}
	
	@RequestMapping(value = "/TimeSlotsRepositoryDelete", method = RequestMethod.POST)
	public void deleteTimeSlotsRepository(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			timeSlotsRepository.deleteById(item);
		}
	}
	
	@RequestMapping(value = "/UserCategoryRepositoryDelete", method = RequestMethod.POST)
	public void deleteUserCategoryRepository(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			userCategoryRepository.deleteById(item);
		}
	}
	
	@RequestMapping(value = "/PaymentModeRepositoryDelete", method = RequestMethod.POST)
	public void deleteUserPaymentModeRepository(@RequestBody Integer delRows[]) {
		for (Integer item : delRows) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println(item);
			paymentModeRepository.deleteById(item);
		}
	}
	
	//###################################################################################
	//###################################################################################
	//###################################################################################
	//Streams
	@RequestMapping(value = "/Streams", method = RequestMethod.POST)
	public @ResponseBody List<Streams> showStreams() {
		return streamsRepository.findAll();
	}

}
