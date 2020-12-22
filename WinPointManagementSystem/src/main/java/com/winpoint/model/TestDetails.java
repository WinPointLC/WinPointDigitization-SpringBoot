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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class TestDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "testDetailId", updatable = false)
	private Integer testDetailId;
	private Integer testNumber;
	private Integer totalQuestions;
	private String rules;
	private String testFees;
	private String negativeMarking;
	private Integer createdBy;
	private Date createdDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "evaluationTypeId", nullable = false)
	private EvaluationType mappingEvaluationType;

//	private Integer courseId = mappingCourse.getCourseId();

//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTestDetails")
//	private Set<TestDifficulty> mappingTestDifficulty;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "testDifficultyLevelId", nullable = false)
	private TestDifficulty mappingTestDifficulty;

}
