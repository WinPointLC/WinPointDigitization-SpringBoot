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
public class UserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId", updatable = false)
	private Integer userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private String address;
	private Date birthDate;
	private String college;
	private String degree;
	private String branch;
	private Integer yearOfGraduation;
	private String photoLocation;
	private String password;
	private String gender;
	private String securityQuestion;
	private String securityAnswer;
	private String occupation;
	private String organization;
	private String designation;
	private String domain;
	private String role;
	private Integer experience;
	private Integer createdBy;
	private Date createDate;
	private String courseAlreadyDone;
	private Boolean activeStatus;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserProfile")
	@JsonBackReference
	private Set<FacultySkills> mappingFacultySkills;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserProfile")
	@JsonBackReference
	private Set<StudentCourseDetails> mappingStudentCourseDetails;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserProfile")
	@JsonBackReference
	private Set<EmployeeDetails> mappingEmployeeDetails;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserProfile")
	@JsonBackReference
	private Set<RevenueDetail> mappingRevenueDetail;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserProfile")
	@JsonBackReference
	private Set<UserTestDetails> mappingUserTestDetails;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserProfile")
	@JsonBackReference
	private Set<UserStudent> mappingUserStudent;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingUserProfile")
	@JsonBackReference
	private Set<CourseFeedback> mappingCourseFeedback;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userCategoryId", nullable = false)
	@JsonManagedReference
	private UserProfile mappingUserCategory;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "securityQuestionId", nullable = false)
	@JsonManagedReference
	private SecurityQuestions mappingSecurityQuestions;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "timeSlotsId", nullable = false)
	@JsonManagedReference
	private TimeSlots mappingTimeSlots;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "segmentTypeId", nullable = false)
	@JsonManagedReference
	private SegmentType mappingSegmentType;

}
