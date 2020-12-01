package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.BatchDetails;


public interface BatchDetialsRepository extends JpaRepository<BatchDetails, Integer>{

	public List<BatchDetails> findByCourseId(Integer courseId);
	
}
