package com.winpoint.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

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
import com.winpoint.model.EnquiryDetails;
import com.winpoint.model.SecurityQuestions;
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
	@Autowired
	StudentCourseDetailsRepository studentCourseDetailsRepository;
	@Autowired
	EnquiryDetailsRepository enquiryDetailsRepository;
	@Autowired
	UserProfileRepository userProfileRepository;
	
	@RequestMapping(value = "/CourseRegistration", method = RequestMethod.GET)
	public ModelAndView CourseRegistrationPage(@RequestParam("userId") String userId, @RequestParam("isEnquired") Boolean isEnquired) {
		System.out.println("COURSE REGISTRATION @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("Is Enquired : "+isEnquired);
		System.out.println("Id : "+userId);
		ModelAndView mv = new ModelAndView();
		List<UserProfile> c = new ArrayList<>();
		List<Streams> c1 = stream.findAll();
		List<Course> courseList = course.findAll();

		
		//boolean isEnquired = true;
		mv.addObject("streamList", c1);
		mv.addObject("courseList", courseList);
		mv.addObject("firstStreamId", c1.get(0).getStreamId());
		if(!isEnquired) {
			if(studentCourseDetailsRepository.findByUserId(Integer.parseInt(userId)).isEmpty()) {
				mv.addObject("studentCourseDetailsList",null);
			}
			else if(studentCourseDetailsRepository.findByUserId(Integer.parseInt(userId))==null) {
				mv.addObject("studentCourseDetailsList",null);
			}
			else {
				mv.addObject("studentCourseDetailsList",studentCourseDetailsRepository.findByUserId(Integer.parseInt(userId)));
			}
		}
		mv.setViewName("CourseRegistration");
		System.out.println("**********" + userId);
		return mv;
	}
	
	
	
	@RequestMapping(value = "/UpdateStudentCourseDetails", method = RequestMethod.POST)
	public void updateStudentCourseDetails(
	@RequestParam("enquired") boolean isEquired,
	@RequestParam("feeStatus") String feeStatus,
	@RequestParam("courseTypeId") String courseTypeId, 
	@RequestParam("courseId") String courseId, 
	@RequestParam("streamId") String streamId,
	@RequestParam("Id") String Id) {
		System.out.println("*********** From updateStudentCourseDetails" );
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("ID - "+Id+"\nCourse ID - "+courseId+"\nFee Status"+feeStatus);
		System.out.println();
		
		System.out.println("Condition : "+isEquired);
		if(isEquired) {
			System.out.println("This is an Enquired student");

			Optional<EnquiryDetails> enquiryDetails = enquiryDetailsRepository.findById(Integer.parseInt(Id));
			
			UserProfile userProfile = new UserProfile();
			System.out.println("First Name : "+enquiryDetails.get().getFirstName());
			userProfile.setFirstName(enquiryDetails.get().getFirstName());
			userProfile.setLastName(enquiryDetails.get().getLastName());
			userProfile.setEmailId(enquiryDetails.get().getEmailId());
			userProfile.setMobileNumber(enquiryDetails.get().getMobileNo());
			userProfile.setAddress(enquiryDetails.get().getAddress());
			userProfile.setBirthDate(enquiryDetails.get().getBirthDate());
			userProfile.setCollege(enquiryDetails.get().getCollege());
			userProfile.setDegree(enquiryDetails.get().getDegree());
			userProfile.setBranch(enquiryDetails.get().getBranch());
			userProfile.setYearOfGraduation(enquiryDetails.get().getYearOfGraduation());
			userProfile.setPhotoLocation(null);
			userProfile.setPassword(enquiryDetails.get().getDefaultPassword());
			userProfile.setGender(enquiryDetails.get().getGender());
			userProfile.setSecurityAnswer("");
			userProfile.setOccupation(enquiryDetails.get().getOccupation());
			userProfile.setOrganization(null);
			userProfile.setDesignation(enquiryDetails.get().getDesignation());
			userProfile.setDomain(enquiryDetails.get().getDomain());
			userProfile.setRole(enquiryDetails.get().getRole());
			userProfile.setExperience(enquiryDetails.get().getExperience());
			userProfile.setActiveStatus(enquiryDetails.get().isActiveStatus());
			userProfile.setEnquired(false);
			
			UserCategory userCategory = new UserCategory();
			userCategory.setUserCategoryId(1);
			userProfile.setMappingUserCategory(userCategory);
			userProfile.setMappingTimeSlots(enquiryDetails.get().getMappingTimeSlots());
			userProfile.setMappingSegmentType(enquiryDetails.get().getMappingSegmentType());
			
			
			userProfileRepository.save(userProfile);
			
			enquiryDetailsRepository.deleteById(Integer.parseInt(Id));
			
			List<UserProfile> newUser = userProfileRepository.findByEmailId(enquiryDetails.get().getEmailId());
			
			UserProfile mappingUserProfile = new UserProfile();
			mappingUserProfile.setUserId(newUser.get(0).getUserId());

			Course mappingCourse = new Course();
			mappingCourse.setCourseId(Integer.parseInt(courseId));
			
			CourseType mappingCourseType = new CourseType();
			mappingCourseType.setCourseTypeId(Integer.parseInt(courseTypeId));
			
			Streams mappingStream = new Streams();
			mappingStream.setStreamId(Integer.parseInt(streamId));
			
			StudentCourseDetails studentCourseDetails = new StudentCourseDetails();
			studentCourseDetails.setMappingUserProfile(mappingUserProfile);
			studentCourseDetails.setMappingCourse(mappingCourse);
			studentCourseDetails.setMappingCourseType(mappingCourseType);
			studentCourseDetails.setMappingStreams(mappingStream);
			studentCourseDetails.setFeeStatus(feeStatus);
				
			studentCourseDetailsRepository.save(studentCourseDetails);
			
		}
		else {
			UserProfile mappingUserProfile = new UserProfile();
			mappingUserProfile.setUserId(Integer.parseInt(Id));
			
			Course mappingCourse = new Course();
			mappingCourse.setCourseId(Integer.parseInt(courseId));
			
			CourseType mappingCourseType = new CourseType();
			mappingCourseType.setCourseTypeId(Integer.parseInt(courseTypeId));
			
			Streams mappingStream = new Streams();
			mappingStream.setStreamId(Integer.parseInt(streamId));
			
			StudentCourseDetails studentCourseDetails = new StudentCourseDetails();
			studentCourseDetails.setMappingUserProfile(mappingUserProfile);
			studentCourseDetails.setMappingCourse(mappingCourse);
			studentCourseDetails.setMappingCourseType(mappingCourseType);
			studentCourseDetails.setMappingStreams(mappingStream);
			studentCourseDetails.setFeeStatus(feeStatus);
			
			studentCourseDetailsRepository.save(studentCourseDetails);
			
		}

	}
	
}
