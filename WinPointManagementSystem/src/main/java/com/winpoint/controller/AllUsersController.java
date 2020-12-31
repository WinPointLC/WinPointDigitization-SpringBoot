package com.winpoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.BatchDetails;
import com.winpoint.model.Course;
import com.winpoint.model.StudentCourseDetails;
import com.winpoint.model.UserProfile;
import com.winpoint.repository.BatchDetialsRepository;
import com.winpoint.repository.CourseRepository;
import com.winpoint.repository.StreamsRepository;
import com.winpoint.repository.UserProfileRepository;

@Controller
public class AllUsersController {

	@Autowired
	StreamsRepository stream;

	@RequestMapping(value = "AllUser", method = RequestMethod.GET)
	public ModelAndView showAllUserPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("AllUser");
		mv.addObject("streamList", stream.findAll());
		return mv;
	}

	@Autowired
	CourseRepository CourseRepository;

	@RequestMapping(value = "/StreamCourseTypeCourses", method = RequestMethod.POST)
	public @ResponseBody List<Course> showCourse(@RequestParam("streamId") String streamId,
			@RequestParam("courseTypeId") String courseTypeId) {
		return CourseRepository.findByCourseTypeIdAndName(Integer.parseInt(courseTypeId), Integer.parseInt(streamId));
	}

	@Autowired
	BatchDetialsRepository batchDetialsRepository;
	@Autowired
	UserProfileRepository userProfileRepository;

	@RequestMapping(value = "/BatchNames", method = RequestMethod.POST)
	public @ResponseBody List<?> showCourse(@RequestParam("courseId") String courseId) {
		List<BatchDetails> list = batchDetialsRepository.findAll();

		for (BatchDetails batchDetails : list) {
			if (batchDetails.getMappingCourse().getCourseId() != Integer.parseInt(courseId)) {
				list.remove(batchDetails);
			}
		}
		return list;
	}

	@RequestMapping(value = "/BatchDetails")
	public @ResponseBody List<UserProfile> returnBatchUsers(@RequestParam String batchId) {
		List<UserProfile> userList = userProfileRepository.findAll();
		int flag = 0;
		for (UserProfile userObject : userList) {
			System.out.println(userObject.getFirstName());
			for (StudentCourseDetails course : userObject.getMappingStudentCourseDetails()) {
				System.out.println("step1");
				if (course.getMappingBatchDetails().getBatchId() == Integer.parseInt(batchId)) {
					System.out.println("First Check");
					System.out.println(userObject.getFirstName()+"\n\n\n\n");
					flag = 1;
					
				}
			}
			if (flag == 0) {
				System.out.println("pehle");
				userList.remove(userObject);
				System.out.println("baadme");
			}
			flag = 0;
			System.out.println("step2");
		}
		
		System.out.println("\n\n\n\n"+userList.isEmpty()+"\n\n\n\n");
		for(UserProfile ue: userList) {
			System.out.println("Lists");
			System.out.println(ue.getFirstName());
		}
		return userList;
	}

}
