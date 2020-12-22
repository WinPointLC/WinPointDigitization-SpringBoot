package com.winpoint.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winpoint.model.CourseType;
import com.winpoint.model.StreamCourseType;
import com.winpoint.repository.CourseTypeRepository;
import com.winpoint.repository.StreamCourseTypeRepository;

@Service
public class CourseTypeService {
	@Autowired
	CourseTypeRepository CourseTypeRepository;
	@Autowired
	StreamCourseTypeRepository StreamCourseTypeRepository;
	
	public List<CourseType> CourseTypeList(Integer streamId) {
		List<CourseType> courseTypeList = new ArrayList<>();
		/*
		 * for(StreamCourseType
		 * streamCourseType:StreamCourseTypeRepository.findByStreamId(streamId)) { //
		 * courseTypeList.add(CourseTypeRepository.findByCourseTypeId(streamCourseType.
		 * getCourseTypeId())); }
		 */
		return courseTypeList;
	}
	
}
