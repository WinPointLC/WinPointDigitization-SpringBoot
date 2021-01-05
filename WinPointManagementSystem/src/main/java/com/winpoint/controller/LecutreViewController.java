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
import com.winpoint.model.Streams;
import com.winpoint.repository.BatchDetailsRepository;
import com.winpoint.repository.StreamsRepository;

@Controller
public class LecutreViewController {
	@Autowired
	StreamsRepository stream;
	
	@Autowired
	BatchDetailsRepository batchDetailsRepository;
	
	@RequestMapping(value = "/LectureView", method = RequestMethod.GET)
	public ModelAndView showLectureViewPage() {
		ModelAndView mv = new ModelAndView();
		List<Streams> c = stream.findAll();
		mv.addObject("streamList", c);
		mv.setViewName("LectureView");
		return mv;
	}
	
	
	  @RequestMapping(value = "/ProgressTracker", method = RequestMethod.GET)
	  public ModelAndView showProgressTrackerPage(@RequestParam String batchId) 
	  { 
	      ModelAndView mv = new
		  ModelAndView();
	      BatchDetails batch = batchDetailsRepository.findById(Integer.parseInt(batchId)).get();
		  mv.addObject("batchObject", batch);
		  mv.setViewName("ProgressTrack"); 
		  return mv; 
	  }
	 
	
	
	@RequestMapping(value = "/LectureViewDetails", method = RequestMethod.POST)
	public @ResponseBody BatchDetails getTimeAndSegment(@RequestParam String batchId) {
		BatchDetails batch = batchDetailsRepository.findById(Integer.parseInt(batchId)).get();
		System.out.println("\n\n\n\n\n"+batch.getMappingCourse().getCourseName()+"\n\n\n\n\n");
		System.out.println("\n\n\n\n\n"+batch.getMappingCourse().getMappingCoursePlans().get(0).getCoursePlansId()+"\n\n\n\n\n");
		
		return batch;
		
	}
}
