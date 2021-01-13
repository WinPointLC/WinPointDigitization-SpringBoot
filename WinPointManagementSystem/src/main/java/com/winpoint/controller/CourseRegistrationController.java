package com.winpoint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.winpoint.model.Streams;
import com.winpoint.model.UserProfile;
import com.winpoint.repository.StreamsRepository;

@Controller
public class CourseRegistrationController {

	@Autowired
	StreamsRepository stream;
	
	@RequestMapping(value = "/CourseRegistration", method = RequestMethod.GET)
	public ModelAndView CourseRegistrationPage(@RequestParam("userId") String userId) {
		ModelAndView mv = new ModelAndView();
		List<UserProfile> c = new ArrayList<>();
		List<Streams> c1 = stream.findAll();
		mv.addObject("streamList", c1);
		mv.addObject("firstStreamId", c1.get(0).getStreamId());

		stream.findById(1).get().getMappingCourse().stream()
				.forEach(y -> y.getMappingStudentCourseDetails().stream()
						.filter(x -> x.getMappingUserProfile().getUserId() == Integer.parseInt(userId))
						.forEach(z -> c.add(z.getMappingUserProfile())));

		mv.setViewName("CourseRegistration");
		System.out.println("**********" + userId);
		return mv;
	}
	
}
