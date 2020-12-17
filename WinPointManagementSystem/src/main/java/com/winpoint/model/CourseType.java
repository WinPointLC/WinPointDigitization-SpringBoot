package com.winpoint.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
//checked//
@Entity
@Data
public class CourseType {
	@Id
	@GeneratedValue
	private Integer courseTypeId;
	private String courseTypeName;
	private Integer createdBy;
	private Date createdDate;
	
	
//	@OneToMany(targetEntity = Course.class)
	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
	private Set<Course> mappingCourse;

//	@OneToMany(targetEntity = StreamCourseType.class)
	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
	private Set<StreamCourseType> mappingStreamCourseType;
	
//	@OneToMany(targetEntity = ToolTips.class)
	@JoinColumn(name = "courseTypeId", referencedColumnName = "courseTypeId")
	private Set<ToolTips> mappingToolTips;	
	
}
