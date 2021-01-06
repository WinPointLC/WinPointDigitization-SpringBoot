package com.winpoint.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
//@JsonIgnoreProperties("inspection")
public class CourseType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "courseTypeId", updatable = false)
	private Integer courseTypeId;
	private String courseTypeName;
	private Integer createdBy;
	@Column(columnDefinition = "datetime")
	private Date createdDate;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourseType")
	private List<Course> mappingCourse;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourseType")
	private List<ToolTips> mappingToolTips;

	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "streamCourseType", joinColumns = @JoinColumn(name = "courseTypeId"), inverseJoinColumns = @JoinColumn(name = "streamId"))
	private List<Streams> mappingStream = new ArrayList<Streams>();

}
