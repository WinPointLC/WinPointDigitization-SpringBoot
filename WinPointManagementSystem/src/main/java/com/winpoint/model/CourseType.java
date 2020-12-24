package com.winpoint.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourseType")
	private List<Course> mappingCourse;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourseType")
	private List<StreamCourseType> mappingStreamCourseType;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourseType")
	private List<ToolTips> mappingToolTips;
	
	

}
