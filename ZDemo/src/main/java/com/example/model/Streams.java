package com.example.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Streams {
//	checked
	@Id
	private Integer streamId;
	private String streamName;
	private Integer createdBy;
	private Date createdDate;
	
	
	@OneToMany(targetEntity = StreamCourseType.class)
	@JoinColumn(name = "streamId", referencedColumnName = "streamId")
	Set<StreamCourseType> streamCourseType;

	@OneToMany(targetEntity = Course.class)
	@JoinColumn(name = "streamId", referencedColumnName = "streamId")
	Set<Course> Course;

	
	
	//////////////////////
}