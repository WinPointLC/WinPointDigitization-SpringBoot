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
import com.example.repository.CourseRepository;
import com.example.repository.CourseTypeRepository;
import com.example.repository.StreamsRepository;

@Controller
public class AllUsersController {
	@RequestMapping(value = "/")
	public String showEmpPage() {
		return "EmployeeDashboard-New";

	}

	@Autowired
	StreamsRepository stream;

	@RequestMapping(value = "AllUser", method = RequestMethod.GET)
	public ModelAndView showAllUserPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("AllUser");
		for(Streams c:stream.findAll()) {
			System.out.println(c);
		}
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
	public @ResponseBody List<?> showCourse(@RequestParam("streamId") String streamId, @RequestParam("courseTypeId") String courseTypeId) {
	return CourseRepository.findByCourseTypeIdAndName(Integer.parseInt(courseTypeId),Integer.parseInt(streamId));
	}
	
	

//	@RequestMapping
//	public ModelAndView streams 
}
