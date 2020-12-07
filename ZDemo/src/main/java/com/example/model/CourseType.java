package com.example.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

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
	
	
	
	@OneToMany(targetEntity = Course.class)
	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
	private Set<Course> Course;
//	
//	
//	
	@OneToMany(targetEntity = StreamCourseType.class)
	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
	private Set<StreamCourseType> StreamCourseType;
	
	@OneToMany(targetEntity = ToolTips.class)
	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
	private Set<ToolTips> ToolTips;	
	
///////////////////////////

}
