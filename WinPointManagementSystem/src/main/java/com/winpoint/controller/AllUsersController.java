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
import com.winpoint.model.CourseType;
import com.winpoint.model.Streams;
import com.winpoint.repository.BatchDetialsRepository;
import com.winpoint.repository.CourseRepository;
import com.winpoint.repository.CourseTypeRepository;
import com.winpoint.repository.StreamsRepository;
import com.winpoint.service.StudentCourseDetailsService;

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
	CourseTypeRepository CourseTypeRepository;

	@RequestMapping(value = "/StreamCourseType", method = RequestMethod.POST)
	public @ResponseBody List<CourseType> showCourseType(@RequestParam("streamId") String streamId) {
		return CourseTypeRepository.findByStreamId(Integer.parseInt(streamId));
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

//	@Autowired
//	BatchDetialsRepository batchDetialsRepository;

	@Autowired
	StudentCourseDetailsService StudentCourseDetailsService;

//	@RequestMapping(value = "/BatchDetails", method = RequestMethod.POST)
//	public @ResponseBody List<Integer> showUsers(@RequestParam("batchId") String batchId) {
//		System.out.println(batchId);
//		System.out.println(StudentCourseDetailsService.userList(Integer.parseInt(batchId)));
//		return StudentCourseDetailsService.userList(Integer.parseInt(batchId));
//	}

}
