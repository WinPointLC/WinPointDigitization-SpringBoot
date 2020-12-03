package com.example.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.CourseType;
import com.example.model.Streams;
import com.example.repository.BatchDetialsRepository;
import com.example.repository.CourseRepository;
import com.example.repository.CourseTypeRepository;
import com.example.repository.StreamsRepository;
import com.example.service.StudentCourseDetailsService;

@Controller
public class AllUsersController {

	@Autowired
	StreamsRepository stream;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView EmpDashboardPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EmployeeDashboard-New");
		List<Streams> c = stream.findAll();
		mv.addObject("streamList", c);
		mv.addObject("firstStreamId", c.get(0).getStreamId());
		return mv;
	}

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
	public @ResponseBody List<?> showCourse(@RequestParam("streamId") String streamId,
			@RequestParam("courseTypeId") String courseTypeId) {
		return CourseRepository.findByCourseTypeIdAndName(Integer.parseInt(courseTypeId), Integer.parseInt(streamId));
	}

	@Autowired
	BatchDetialsRepository batchDetialsRepository;

	@RequestMapping(value = "/BatchNames", method = RequestMethod.POST)
	public @ResponseBody List<?> showCourse(@RequestParam("courseId") String courseId) {
		return batchDetialsRepository.findByCourseId(Integer.parseInt(courseId));
	}

//	@Autowired
//	BatchDetialsRepository batchDetialsRepository;

	@Autowired
	StudentCourseDetailsService StudentCourseDetailsService;

	@RequestMapping(value = "/BatchDetails", method = RequestMethod.POST)
	public @ResponseBody List<?> showUsers(@RequestParam("batchId") String batchId) {
		System.out.println(batchId);
		System.out.println(StudentCourseDetailsService.userList(Integer.parseInt(batchId)));
			return StudentCourseDetailsService.userList(Integer.parseInt(batchId));		
	}

}
