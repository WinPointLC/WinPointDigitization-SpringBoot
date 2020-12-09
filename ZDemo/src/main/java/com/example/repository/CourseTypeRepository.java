package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.CourseType;

@Repository
public interface CourseTypeRepository extends JpaRepository<CourseType, Integer>{
	CourseType findByCourseTypeId(Integer courseTypeId);
	
	
//	void getCourseTypeList
	
	
}

