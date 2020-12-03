package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
//checked//
@Entity
@Data
public class CourseType {
	@Id
	private Integer courseTypeId;
	private String courseTypeName;
	private Integer createdBy;
	private Date createddDate;
	
	
	
//	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
//	private List<Course> Course;
//	
//	
//	
//	@OneToMany(targetEntity = StreamCourseType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
//	private List<StreamCourseType> StreamCourseType;
	
	
///////////////////////////

}
