package com.winpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
//	private Integer courseTypeId;
	private Date createdDate;
	private String createdBy;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseTypeId", nullable = false)
	private Course mappingCourseType;
	
}
