package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winpoint.model.StudentCourseDetails;

public interface StudentCourseDetailsRepository extends JpaRepository<StudentCourseDetails, Integer>{
	
}
