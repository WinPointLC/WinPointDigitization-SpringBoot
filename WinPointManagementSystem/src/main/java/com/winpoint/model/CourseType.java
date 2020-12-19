package com.winpoint.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
//checked//
@Entity
@Data
public class CourseType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="courseTypeId", updatable=false)
	private Integer courseTypeId;
	private String courseTypeName;
	private Integer createdBy;
	private Date createdDate;
	
	
//	@OneToMany(targetEntity = Course.class)
//	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
//	private Set<Course> mappingCourse;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingCourseType")
	private Set<Course> mappingCourse;
	
//	@OneToMany(targetEntity = StreamCourseType.class)
//	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
//	private Set<StreamCourseType> mappingStreamCourseType;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingCourseType")
	private Set<StreamCourseType> mappingStreamCourseType;
	
//	@OneToMany(targetEntity = ToolTips.class)
//	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
//	private Set<ToolTips> mappingToolTips;	

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingCourseType")
	private Set<ToolTips> mappingToolTips;	
	
}
