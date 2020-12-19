package com.winpoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

//checked
@Entity
@Data
public class CoursePlans {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="coursePlansId", updatable=false)
	private Integer coursePlansId;
//	private Integer courseId;
	private Integer lectureNumber;
	private String lecturePlan;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;

	
}
