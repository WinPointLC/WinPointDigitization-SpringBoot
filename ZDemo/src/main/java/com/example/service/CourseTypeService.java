package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.CourseType;
import com.example.model.StreamCourseType;
import com.example.repository.CourseTypeRepository;
import com.example.repository.StreamCourseTypeRepository;

@Service
public class CourseTypeService {
	@Autowired
	CourseTypeRepository CourseTypeRepository;
	@Autowired
	StreamCourseTypeRepository StreamCourseTypeRepository;
	
	public List<CourseType> CourseTypeList(Integer streamId) {
		List<CourseType> courseTypeList = new ArrayList<>();
		for(StreamCourseType streamCourseType:StreamCourseTypeRepository.findByStreamId(streamId)) {
			courseTypeList.add(CourseTypeRepository.findByCourseTypeId(streamCourseType.getCourseTypeId()));
		}
		return courseTypeList;
	}
}
