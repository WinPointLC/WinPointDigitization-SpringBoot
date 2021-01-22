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
import com.winpoint.model.Streams;
import com.winpoint.model.StudentCourseDetails;
import com.winpoint.model.UserCategory;
import com.winpoint.model.UserProfile;
import com.winpoint.repository.CourseRepository;
import com.winpoint.repository.StreamsRepository;
import com.winpoint.repository.StudentCourseDetailsRepository;

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
	
	/*
	 * @RequestMapping(value = "/UpdateStudentCourseDetails", method =
	 * RequestMethod.GET) //public void updateStudentCourseDetails(@RequestBody
	 * StudentCourseDetails studentCourseDetails) { public void
	 * updateStudentCourseDetails() {
	 * System.out.println("*********** From updateStudentCourseDetails" );//+
	 * studentCourseDetails);
	 * //studentCourseDetailsRepository.save(studentCourseDetails.
	 * getMappingUserProfile().getUserId(),studentCourseDetails.getMappingCourse().
	 * getCourseId(),studentCourseDetails.getFeeStatus());
	 * //studentCourseDetailsRepository.save(studentCourseDetails); }
	 */

	@RequestMapping(value = "/UpdateStudentCourseDetails", method = RequestMethod.POST)
	public void updateStudentCourseDetails(@RequestParam("feeStatus") String feeStatus,
	@RequestParam("courseTypeId") String courseTypeId, @RequestParam("courseId") String courseId, @RequestParam String userId) {
		System.out.println("*********** From updateStudentCourseDetails" );
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("User ID - "+userId+"\nCourse ID - "+courseId+"\nFee Status"+feeStatus);
		System.out.println();
		UserProfile mappingUserProfile = new UserProfile();
		mappingUserProfile.setUserId(Integer.parseInt(userId));
		Course mappingCourse = new Course();
		mappingCourse.setCourseId(Integer.parseInt(courseId));
		StudentCourseDetails studentCourseDetails = new StudentCourseDetails();
		studentCourseDetails.setMappingUserProfile(mappingUserProfile);
		studentCourseDetails.setMappingCourse(mappingCourse);
		studentCourseDetails.setFeeStatus(feeStatus);
		
		studentCourseDetailsRepository.save(studentCourseDetails);
		
		
		
		//batch_id
		//course_id
		//expense_type_id
		//grade_id
		//reminder_type_id
		//user_id
		//stream_id
	}
	
//	@RequestMapping(value = "/UpdateStudentCourseDetails", method = RequestMethod.POST)
//	public void updateStudentCourseDetails(@RequestBody StudentCourseDetails studentCourseDetails) {
//		System.out.println("*********** From updateStudentCourseDetails" );
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		System.out.println(studentCourseDetails);
//		System.out.println("User ID - "+studentCourseDetails.getMappingUserProfile().getUserId()+
//							"\nCourse ID - "+studentCourseDetails.getMappingCourse().getCourseId()+
//							"\nFee Status - "+studentCourseDetails.getFeeStatus());
//		System.out.println("Fee Status : "+studentCourseDetails.getFeeStatus());
//		System.out.println("User ID - "+studentCourseDetails.getMappingUserProfile().getUserId());
//
//		System.out.println("Course ID - "+studentCourseDetails.getMappingCourse().getCourseId());
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}
