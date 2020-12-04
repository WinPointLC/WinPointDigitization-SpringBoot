package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class UserTestDetails {
//	checked 
//	redo fk
	@Id
	private Integer userTestId;//
	private Integer userId;//
	private Integer testDetailsId;//
	private Integer marksReceived;
	private String timeTaken;
	private Integer numberOfRegistration;
	private String feeStatus;
	private Integer createdBy;
	private Date createdDate;
	private Integer attempted;
	private String evaluationDone;

//	@OneToMany(targetEntity = StudentsModularTestResult_C_TBC.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<StudentsModularTestResult_C_TBC> ModularTestResult_C_TBC;
//
//	@OneToMany(targetEntity = StudentTestResult_C_Modular.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<StudentTestResult_C_Modular> StudentTestResult_C_Modular;
//
//	@OneToMany(targetEntity = StudentTestResult_CPP_CRT.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<StudentTestResult_CPP_CRT> StudentTestResult_CPP_CRT;
//
//	@ManyToOne(targetEntity = StudentTestResult_CPP_Modular.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<StudentTestResult_CPP_Modular> StudentTestResult_CPP_Modular;
//
//	@OneToMany(targetEntity = StudentTestResult_CPP_TBC.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<StudentTestResult_CPP_TBC> StudentTestResult_CPP_TBC;
//
//	@OneToMany(targetEntity = UserTestDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<StudentTestResultComputerNetwork_CRT> StudentTestResultComputerNetwork_CRT;
//
//	@ManyToOne(targetEntity = StudentTestResultJava_CRT.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<StudentTestResultJava_CRT> StudentTestResultJava_CRT;
//
//	@ManyToOne(targetEntity = UserTestDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<StudentTestResultJava_TBC> StudentTestResultJava_TBC;
//
//	@ManyToOne(targetEntity = StudentTestResultJavaModular.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<StudentTestResultJavaModular> StudentTestResultJavaModular;
//
//	@OneToMany(targetEntity = StudentTestResultJavascriptModular.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<StudentTestResultJavascriptModular> StudentTestResultJavascriptModular;
//
//	@ManyToOne(targetEntity = StudentTestResultOperatingSystem_CRT.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<StudentTestResultOperatingSystem_CRT> StudentTestResultOperatingSystem_CRT;
//
//	@OneToMany(targetEntity = UserTestDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
//	private List<TestFeedback> TestFeedback;
//
//	////////////////////////////
//
	@ManyToOne
	private UserProfile UserProfile;

	@ManyToOne
	private TestDetails TestDetails;

}