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
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Streams {
//	checked
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="streamId", updatable=false)
	private Integer streamId;
	private String streamName;
	private Integer createdBy;
	private Date createdDate;

//	@OneToMany(targetEntity = StreamCourseType.class)
//	@JoinColumn(name = "streamId", referencedColumnName = "streamId")
//	Set<StreamCourseType> mappingStreamCourseType;
	
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingStreams")
	private Set<StreamCourseType> mappingStreamCourseType;
	
//
//	@OneToMany(targetEntity = Course.class)
//	@JoinColumn(name = "streamId", referencedColumnName = "streamId")
//	Set<Course> mappingCourse;
	
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingStreams")
	private Set<Course> mappingCourse;

}