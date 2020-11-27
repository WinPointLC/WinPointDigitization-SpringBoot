package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
//checked
@Entity
@Data
public class Course {
	@Id
	private Integer courseId;
	private String courseName;
	private Integer streamId;
	private Integer courseTypeId;

}