package com.example.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Streams;
import com.example.repository.StreamsRepository;

@Controller
public class AddQuestionController {
//	@RequestMapping(value = "AddNewQuestion")
//	public String showAddQuestionPage() {
//		return "AddNewQuestion";
//
//	}

	@Autowired
	StreamsRepository stream;

	@RequestMapping(value = "AddNewQuestion", method = RequestMethod.GET)
	public ModelAndView showAddNewQuestionPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("AddNewQuestion");
		for (Streams i : stream.findAll()) {
			System.out.println(i);
		}
		mv.addObject("streamList", stream.findAll());
		return mv;
	}
}
