package com.winpoint.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class GradingSystem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gradeId", updatable = false)
	private Integer gradeId;
	private Integer marksLowerLimit;
	private Integer marksHigherLimit;
	private Integer createdBy;
	private Date createdDate;

//	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingGradingSystem")
	private Set<StudentCourseDetails> mappingStudentCourseDetails;
}
