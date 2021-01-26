package com.winpoint.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.Course;
import com.winpoint.model.EnquiryDetails;
import com.winpoint.model.Streams;
import com.winpoint.model.StudentCourseDetails;
import com.winpoint.model.UserCategory;
import com.winpoint.model.UserProfile;
import com.winpoint.repository.CourseRepository;
import com.winpoint.repository.EnquiryDetailsRepository;
import com.winpoint.repository.StreamsRepository;
import com.winpoint.repository.StudentCourseDetailsRepository;
import com.winpoint.repository.UserProfileRepository;

@Controller
public class CourseRegistrationController {

	@Autowired
	StreamsRepository stream;

	@Autowired
	CourseRepository course;

	@RequestMapping(value = "/CourseRegistration", method = RequestMethod.GET)
	public ModelAndView CourseRegistrationPage(@RequestParam("userId") String userId) {
		System.out.println("COURSE REGISTRATION @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		ModelAndView mv = new ModelAndView();
		List<UserProfile> c = new ArrayList<>();
		List<Streams> c1 = stream.findAll();
		List<Course> courseList = course.findAll();

		mv.addObject("streamList", c1);
		mv.addObject("courseList", courseList);
		mv.addObject("firstStreamId", c1.get(0).getStreamId());

		stream.findById(1).get().getMappingCourse().stream()
				.forEach(y -> y.getMappingStudentCourseDetails().stream()
						.filter(x -> x.getMappingUserProfile().getUserId() == Integer.parseInt(userId))
						.forEach(z -> c.add(z.getMappingUserProfile())));

		mv.setViewName("CourseRegistration");
		System.out.println("**********" + userId);
		return mv;
	}
	
	@Autowired
	StudentCourseDetailsRepository studentCourseDetailsRepository;
	@Autowired
	EnquiryDetailsRepository enquiryDetailsRepository;
	@Autowired
	UserProfileRepository userProfileRepository;
	
	@RequestMapping(value = "/UpdateStudentCourseDetails", method = RequestMethod.POST)
	public void updateStudentCourseDetails(
	@RequestParam("enquired") boolean isEquired,
	@RequestParam("feeStatus") String feeStatus,
	@RequestParam("courseTypeId") String courseTypeId, 
	@RequestParam("courseId") String courseId, 
	@RequestParam String Id) {
		System.out.println("*********** From updateStudentCourseDetails" );
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("ID - "+Id+"\nCourse ID - "+courseId+"\nFee Status"+feeStatus);
		System.out.println();
		UserProfile mappingUserProfile = new UserProfile();
		mappingUserProfile.setUserId(Integer.parseInt(Id));
		Course mappingCourse = new Course();
		mappingCourse.setCourseId(Integer.parseInt(courseId));
		StudentCourseDetails studentCourseDetails = new StudentCourseDetails();
		studentCourseDetails.setMappingUserProfile(mappingUserProfile);
		studentCourseDetails.setMappingCourse(mappingCourse);
		studentCourseDetails.setFeeStatus(feeStatus);
		
		studentCourseDetailsRepository.save(studentCourseDetails);
		
		
		if(isEquired) {
			System.out.println("This is an Enquired student");
//			userProfileRepository.save(enquiryDetailsRepository.findAllById(Integer.parseInt(Id)));
//			enquiryDetailsRepository.delete(enquiryDetailsRepository.findAllById(Integer.parseInt(Id)));
		}

		
		
		
		//batch_id
		//course_id e
		//expense_type_id - done
		//grade_id
		//reminder_type_id
		//user_id
		//stream_id
	}
	
	
}
