package com.winpoint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.winpoint.model.StudentCourseDetails;
import com.winpoint.repository.StreamsRepository;
import com.winpoint.repository.StudentCourseDetailsRepository;

@Controller
public class MainCoursePageController {

	@Autowired
	StreamsRepository stream;

	@Autowired
	StudentCourseDetailsRepository studentCourseDetailsRepository;
	
	@RequestMapping(value = "/TestSelect", method = RequestMethod.GET)
	public @ResponseBody List<StudentCourseDetails> ClientDashBoardCardData(
			@RequestParam("streamId") String streamId,
			@RequestParam("courseTypeId") String courseTypeId,
			@RequestParam("courseId") String courseId 
			) {
		System.out.println("*****************************************Client DashBoard Card Data*********************************************************");
		List<StudentCourseDetails> studentRegisteredCourseList = new ArrayList<StudentCourseDetails>();
		studentRegisteredCourseList.addAll(studentCourseDetailsRepository.findByUserId(Integer.parseInt(userId),Integer.parseInt(streamId),Integer.parseInt(courseTypeId)));
		System.out.println("Registered courses Length = "+studentRegisteredCourseList.size());
		return studentRegisteredCourseList;		
	}
	
}
