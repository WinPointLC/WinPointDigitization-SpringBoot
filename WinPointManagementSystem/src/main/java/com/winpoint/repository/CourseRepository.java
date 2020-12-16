package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winpoint.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
	Course findByCourseName(String CourseName);
}
