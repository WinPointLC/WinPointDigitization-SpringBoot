package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

//checked
@Entity
@Data
public class CoursePlans {

	@Id
	private Integer coursePlansId;
	private Integer courseId;
	private Integer lectureNumber;
	private String lecturePlan;

	@ManyToOne
	private Course Course;

}
