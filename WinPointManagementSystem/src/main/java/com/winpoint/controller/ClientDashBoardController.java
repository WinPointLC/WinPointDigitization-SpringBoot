package com.winpoint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.Course;
import com.winpoint.model.Streams;
import com.winpoint.model.StudentCourseDetails;
import com.winpoint.model.UserProfile;
import com.winpoint.repository.StreamsRepository;
import com.winpoint.repository.StudentCourseDetailsRepository;

@Controller
public class ClientDashBoardController {

	@Autowired
	StreamsRepository stream;

	@Autowired
	StudentCourseDetailsRepository studentCourseDetailsRepository;
	
	@RequestMapping(value = "/client", method = RequestMethod.GET)
	public ModelAndView ClientDashboardPage() {
		System.out.println("Entered the Client Dashboards Controller");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ClientDashboard-New");
		List<Streams> c = stream.findAll();
		System.out.println(c);
		mv.addObject("streamList", c);
		mv.addObject("firstStreamId", c.get(0).getStreamId());
				
		return mv;
	}

	@RequestMapping(value = "/MainCoursePage", method = RequestMethod.GET)
	public ModelAndView OnlineEvaluationPage() {
		ModelAndView mv = new ModelAndView();
		List<Streams> c = stream.findAll();
		mv.addObject("streamList", c);
		mv.addObject("firstStreamId", c.get(0).getStreamId());
		
		mv.setViewName("MainCoursePage");
		return mv;
	}

	@RequestMapping(value = "/Analytics", method = RequestMethod.GET)
	public ModelAndView AnalyticsPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Analytics");
		return mv;
	}
	
	@RequestMapping(value = "/Analytics_new", method = RequestMethod.GET)
	public ModelAndView AnalyticsNewPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Analytics_new");
		return mv;
	}

	@RequestMapping(value = "/StreamCourseTypeUserCourses", method = RequestMethod.GET)
	public @ResponseBody List<Course> ClientDashBoardCardData(
			@RequestParam("userId") String userId,
			@RequestParam("streamId") String streamId,
			@RequestParam("courseTypeId") String courseTypeId
			) {
		System.out.println("*****************************************Client DashBoard Card Data*********************************************************");
		ModelAndView mv = new ModelAndView();
		System.out.println("1");
		List<Course> registeredCoursesList = new ArrayList<Course>();
		System.out.println("2");
		List<StudentCourseDetails> studentRegisteredCourseList = new ArrayList<StudentCourseDetails>();
		studentRegisteredCourseList.addAll(studentCourseDetailsRepository.findByUserId(Integer.parseInt(userId),Integer.parseInt(streamId),Integer.parseInt(courseTypeId)));
		System.out.println("3");
		//System.out.println("Data : "+studentRegisteredCourseList.get(0).getCourseName());
		for(StudentCourseDetails studentCourseDetails : studentRegisteredCourseList) {
			//System.out.println("1");
			registeredCoursesList.add(studentCourseDetails.getMappingCourse());
			System.out.println("Registered Courses : "+studentCourseDetails.getMappingCourse());
		}
		mv.addObject("studentCourseDetailsUserList",registeredCoursesList);
		return registeredCoursesList;		
	}
	
}
