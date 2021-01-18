package com.winpoint.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.winpoint.model.Course;
import com.winpoint.model.EnquiryDetails;
import com.winpoint.model.UserProfile;
import com.winpoint.repository.CourseRepository;
import com.winpoint.repository.StreamsRepository;
import com.winpoint.repository.UserProfileRepository;

@Controller
public class PriorityListOfCoursesController {

	@Autowired
	UserProfileRepository userProfileRepository;
	
	@Autowired
	StreamsRepository streamsRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	public void getPriorityListOfCoursesList() {
		
		int flag = 0;
		
		HashMap<Course, List<EnquiryDetails>> enquiredStudentsCourseMap = new HashMap<Course, List<EnquiryDetails>>();
		
		
		List<Course> coursesList = (List<Course>) streamsRepository.findById(1).get().getMappingCourse();
		
		for(Course course: coursesList) {
			List<EnquiryDetails> interestedEnquiredDetailsList =  new ArrayList<>();
			interestedEnquiredDetailsList.addAll(course.getMappingInterestedEnquiryDetails());
			for(EnquiryDetails enquiryDetails: interestedEnquiredDetailsList) {
				for(String courseId: course.getPreRequisite().split(",")) {  // JAVA = c,c++,DS   
					for(Course courseDone: enquiryDetails.getMappingCoursesAlreadyDone()) {   // c,c++
						if(courseDone.getCourseId()== Integer.parseInt(courseId)) {
							flag = 1;
						}
					}
					if(flag == 0) {
						interestedEnquiredDetailsList.remove(enquiryDetails);
					}
					flag = 0;
				}
			}
//			enquiredStudentsCourseMap.add(course,interestedEnquiredDetailsList);
		}
		
		
		int userFlag = 0;
		
				
		HashMap<Course, List<UserProfile>> userProfileCourseMap = new HashMap<>();
		for(Course course: coursesList) {    //JAVA
			//selected the course to get the list
			List<UserProfile> interestedUserProfileList =  new ArrayList<>();
			// created the list of interested student.
			interestedUserProfileList.add((UserProfile) userProfileRepository.findAll());
			//UserProfile user = new UserProfile();
			for(UserProfile user: interestedUserProfileList) {
				if(user.getMappingUserCoursesAlreadyDone().contains(course)) {
					interestedUserProfileList.remove(user);
					break;
				}
				for(String courseId: course.getPreRequisite().split(",")) {  
					// JAVA = c,c++,DS
					for(Course courseDone: user.getMappingUserCoursesAlreadyDone()) {
						if(courseDone.getCourseId()== Integer.parseInt(courseId)) {
							userFlag = 1;
						}
					}
					if(flag == 0) {
						interestedUserProfileList.remove(user);
					}
					flag = 0;	
				}
			}
//			userProfileCourseMap.add(course, interestedUserProfileList);
		}
		
	}
	
}
