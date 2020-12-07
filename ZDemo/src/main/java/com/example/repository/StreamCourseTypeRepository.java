package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.StreamCourseType;

@Repository
public interface StreamCourseTypeRepository extends JpaRepository<StreamCourseType, Integer>{
	List<StreamCourseType> findByStreamId(Integer streamId);
}
