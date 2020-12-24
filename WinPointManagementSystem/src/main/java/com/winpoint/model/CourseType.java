package com.winpoint.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class CourseType{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "courseTypeId", updatable = false)
	private Integer courseTypeId;
	private String courseTypeName;
	private Integer createdBy;
	private Date createdDate;

	
	
	
	public CourseType(Integer courseTypeId, String courseTypeName, Integer createdBy, Date createdDate) {
		super();
		this.courseTypeId = courseTypeId;
		this.courseTypeName = courseTypeName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	public CourseType() {
		super();
	}
	
	public CourseType(Integer courseTypeId, String courseTypeName, Integer createdBy, Date createdDate,
			List<Course> mappingCourse, List<StreamCourseType> mappingStreamCourseType,
			List<ToolTips> mappingToolTips) {
		super();
		this.courseTypeId = courseTypeId;
		this.courseTypeName = courseTypeName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.mappingCourse = mappingCourse;
		this.mappingStreamCourseType = mappingStreamCourseType;
		this.mappingToolTips = mappingToolTips;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourseType")
	private List<Course> mappingCourse;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourseType")
	private List<StreamCourseType> mappingStreamCourseType;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourseType")
	private List<ToolTips> mappingToolTips;
	
	

}
