package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TechnicalQuestionBank {
//	checked
//	fk
	@Id
	private Integer questionId;
	private String courseId;
	private String topicId;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private Character correctOption;
	private Integer marks;
	private String explanation;
	private Integer difficultyLevelId;
	private String inCrt;
	private String createdBy;
	private Date createdDate;

//	@OneToMany(targetEntity = StudentsModularTestResult_C_TBC.class)
//    @JoinColumn(name = "questionId", referencedColumnName = "questionId")
//	private Set<StudentsModularTestResult_C_TBC> ModularTestResult_C_TBC;
//
//	@OneToMany(targetEntity = TechnicalQuestionBank.class)
//	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
//	private Set<StudentTestResult_C_Modular> StudentTestResult_C_Modular;
//
//	@OneToMany(targetEntity = StudentTestResult_CPP_CRT.class)
//	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
//	private Set<StudentTestResult_CPP_CRT> StudentTestResult_CPP_CRT;
//
//	@OneToMany(targetEntity = StudentTestResult_CPP_Modular.class)
//	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
//	private Set<StudentTestResult_CPP_Modular> StudentTestResult_CPP_Modular;
//
//	@OneToMany(targetEntity = StudentTestResult_CPP_TBC.class)
//	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
//	private Set<StudentTestResult_CPP_TBC> StudentTestResult_CPP_TBC;
//
//	@OneToMany(targetEntity = TechnicalQuestionBank.class)
//	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
//	private Set<StudentTestResultComputerNetwork_CRT> StudentTestResultComputerNetwork_CRT;
//
//	@OneToMany(targetEntity = TechnicalQuestionBank.class)
//	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
//	private Set<StudentTestResultJava_CRT> StudentTestResultJava_CRT;
//
//	@OneToMany(targetEntity = TechnicalQuestionBank.class)
//	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
//	private Set<StudentTestResultJava_TBC> StudentTestResultJava_TBC;
//
//	@OneToMany(targetEntity = StudentTestResultJavaModular.class)
//	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
//	private Set<StudentTestResultJavaModular> StudentTestResultJavaModular;
//
//	@OneToMany(targetEntity = StudentTestResultJavascriptModular.class)
//	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
//	private Set<StudentTestResultJavascriptModular> StudentTestResultJavascriptModular;
//
//	@OneToMany(targetEntity = StudentTestResultOperatingSystem_CRT.class)
//	@JoinColumn(name = "questionId", referencedColumnName = "questionId")
//	private Set<StudentTestResultOperatingSystem_CRT> StudentTestResultOperatingSystem_CRT;



}
