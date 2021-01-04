package com.winpoint.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TechnicalQuestionBank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "questionId", updatable = false)
	private Integer questionId;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private Character correctOption;
	private Integer marks;
	private String explanation;
	private String inCrt;
	private String createdBy;
	@Column(columnDefinition = "datetime")
	private Date createdDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "difficultyLevelId", nullable = false)
	private DifficultyLevel mappingDifficultyLevel;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "topicId", nullable = false)
	private Topics mappingTopics;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTechnicalQuestionBank")
	private List<StudentsModularTestResult_C_TBC> mappingStudentsModularTestResult_C_TBC=new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTechnicalQuestionBank")
	private List<StudentTestResult_C_Modular> mappingStudentTestResult_C_Modular=new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTechnicalQuestionBank")
	private List<StudentTestResult_CPP_CRT> mappingStudentTestResult_CPP_CRT=new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTechnicalQuestionBank")
	private List<StudentTestResult_CPP_Modular> mappingStudentTestResult_CPP_Modular=new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTechnicalQuestionBank")
	private List<StudentTestResult_CPP_TBC> mappingStudentTestResult_CPP_TBC=new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTechnicalQuestionBank")
	private List<StudentTestResultComputerNetwork_CRT> mappingStudentTestResultComputerNetwork_CRT=new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTechnicalQuestionBank")
	private List<StudentTestResultJava_CRT> mappingStudentTestResultJava_CRT=new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTechnicalQuestionBank")
	private List<StudentTestResultJava_TBC> mappingStudentTestResultJava_TBC=new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTechnicalQuestionBank")
	private List<StudentTestResultJavaModular> mappingStudentTestResultJavaModular=new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTechnicalQuestionBank")
	private List<StudentTestResultJavascriptModular> mappingStudentTestResultJavascriptModular=new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTechnicalQuestionBank")
	private List<StudentTestResultOperatingSystem_CRT> mappingStudentTestResultOperatingSystem_CRT=new ArrayList<>();

}
