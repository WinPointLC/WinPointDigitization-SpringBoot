package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StreamCourseType {
//	checked
	@Id
	private Integer streamCourseTypeId;
	private Integer streamId;
	private Integer courseTypeId;
	private Date createdDate;
	private String createdBy;

//	@ManyToOne
//	private Streams Streams;
//
//	@ManyToOne
//	private CourseType CourseType;

}
