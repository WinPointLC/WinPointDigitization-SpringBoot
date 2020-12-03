package com.example.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.repository.StreamsRepository;

@Controller
public class FeeRegistrationController {

	@Autowired
	StreamsRepository stream;

	@RequestMapping(value = "FeeRegistrationPage-New", method = RequestMethod.GET)
	public ModelAndView showAddNewQuestionPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FeeRegistrationPage-New");
		mv.addObject("streamList", stream.findAll());
		return mv;
	}

}
