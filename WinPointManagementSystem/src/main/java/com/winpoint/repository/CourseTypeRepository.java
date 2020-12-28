package com.winpoint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.winpoint.model.CourseType;

@Repository
public interface CourseTypeRepository extends JpaRepository<CourseType, Integer>{
	
	@Query("FROM CourseType a WHERE  streamId = ?1")
    List<CourseType> findByCourseTypeIdAndName(Integer streamId);
	
	
	
	
}

