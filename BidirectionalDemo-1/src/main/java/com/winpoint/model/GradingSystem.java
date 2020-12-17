package com.winpoint.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class GradingSystem {
//	checked
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="gradeId", updatable=false)
	private Integer gradeId;
	private Integer marksLowerLimit;
	private Integer marksHigherLimit;
	private Integer createdBy;
	private Date createdDate;
	
	
//	@OneToMany(targetEntity = StudentCourseDetails.class)
//	@JoinColumn(name = "gradeId", referencedColumnName = "gradeId")
//	private Set<StudentCourseDetails> mappingStudentCourseDetails;
	

}
