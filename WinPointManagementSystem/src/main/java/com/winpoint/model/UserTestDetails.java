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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserTestDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userTestId", updatable = false)
	private Integer userTestId;
	private Integer testDetailsId;
	private Integer marksReceived;
	private String timeTaken;
	private Integer numberOfRegistration;
	private String feeStatus;
	private Integer createdBy;
	private Date createdDate;
	private Integer attempted;
	private String evaluationDone;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserTestDetails")
	@JsonBackReference
	private Set<StudentsModularTestResult_C_TBC> ModularTestResult_C_TBC;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserTestDetails")
	@JsonBackReference
	private Set<StudentTestResult_C_Modular> StudentTestResult_C_Modular;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserTestDetails")
	@JsonBackReference
	private Set<StudentTestResult_CPP_CRT> StudentTestResult_CPP_CRT;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserTestDetails")
	@JsonBackReference
	private Set<StudentTestResult_CPP_Modular> StudentTestResult_CPP_Modular;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserTestDetails")
	@JsonBackReference
	private Set<StudentTestResult_CPP_TBC> StudentTestResult_CPP_TBC;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserTestDetails")
	@JsonBackReference
	private Set<StudentTestResultComputerNetwork_CRT> StudentTestResultComputerNetwork_CRT;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserTestDetails")
	@JsonBackReference
	private Set<StudentTestResultJava_CRT> StudentTestResultJava_CRT;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserTestDetails")
	@JsonBackReference
	private Set<StudentTestResultJava_TBC> StudentTestResultJava_TBC;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserTestDetails")
	@JsonBackReference
	private Set<StudentTestResultJavaModular> StudentTestResultJavaModular;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserTestDetails")
	@JsonBackReference
	private Set<StudentTestResultJavascriptModular> StudentTestResultJavascriptModular;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserTestDetails")
	@JsonBackReference
	private Set<StudentTestResultOperatingSystem_CRT> StudentTestResultOperatingSystem_CRT;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
	@JsonManagedReference
	private UserProfile mappingUserProfile;

}