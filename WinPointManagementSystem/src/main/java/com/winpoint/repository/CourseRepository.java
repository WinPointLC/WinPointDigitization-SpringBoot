package com.winpoint.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.winpoint.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
	@Query("FROM Course a WHERE course_Type_Id = ?1 AND stream_Id = ?2")
    List<Course> findByCourseTypeIdAndName(Integer courseTypeId, Integer streamId);
	
	
}
