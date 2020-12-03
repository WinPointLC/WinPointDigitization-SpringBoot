package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

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
	

//	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "streamId", referencedColumnName = "streamId")
//	private List<Course> Course;
//	
//	
//	@OneToMany(targetEntity = StreamCourseType.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "streamId", referencedColumnName = "streamId")
//	private List<StreamCourseType> StreamCourseType;
//	
	
	
	//////////////////////
}