package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Streams {
//	checked
	@Id
	@GeneratedValue
	private Integer streamId;
	private String streamName;
	private Integer createdBy;
	private Date createdDate;

//	@OneToMany(targetEntity = StreamCourseType.class)
//	@JoinColumn(name = "streamId", referencedColumnName = "streamId")
//	Set<StreamCourseType> mappingStreamCourseType;
//
//	@OneToMany(targetEntity = Course.class)
//	@JoinColumn(name = "streamId", referencedColumnName = "streamId")
//	Set<Course> mappingCourse;

}