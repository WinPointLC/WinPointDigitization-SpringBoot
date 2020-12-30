package com.winpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winpoint.repository.CourseTypeRepository;

@Service
public class CourseTypeService {
	@Autowired
	CourseTypeRepository CourseTypeRepository;
	
	
	
}
