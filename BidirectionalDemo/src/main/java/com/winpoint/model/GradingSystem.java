package com.winpoint.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class GradingSystem {
//	checked
	@Id
	@GeneratedValue
	private Integer gradeId;
	private Integer marksLowerLimit;
	private Integer marksHigherLimit;
	private Integer createdBy;
	private Date createdDate;
	
	
//	@OneToMany(targetEntity = StudentCourseDetails.class)
//	@JoinColumn(name = "gradeId", referencedColumnName = "gradeId")
//	private Set<StudentCourseDetails> mappingStudentCourseDetails;
	

}
