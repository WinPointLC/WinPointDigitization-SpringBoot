package com.winpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StreamCourseType {
//	checked
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="streamCourseTypeId", updatable=false)	
	private Integer streamCourseTypeId;
	private Integer streamId;
	private Integer courseTypeId;
	private Date createdDate;
	private String createdBy;

}
