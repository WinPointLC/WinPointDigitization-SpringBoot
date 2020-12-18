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
public class UserProfile {
//	checked
//	redo fk
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userId", updatable=false)	
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
	private Integer segmentTypeId;
	private String courseAlreadyDone;
	private Boolean activeStatus;
	
//	@OneToMany(targetEntity = FacultySkills.class)
//	@JoinColumn(name = "facultyUserId", referencedColumnName = "userId")
//	private Set<FacultySkills> FacultySkills;
	
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingUserProfile")
	private Set<FacultySkills> mappingFacultySkills;
//
//	@OneToMany(targetEntity = StudentCourseDetails.class)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private Set<StudentCourseDetails> StudentCourseDetails;
//
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingUserProfile")
	private Set<StudentCourseDetails> mappingStudentCourseDetails;
	
	


	
	
	
//	@OneToMany(targetEntity = EmployeeDetails.class)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private Set<EmployeeDetails> EmployeeDetails;
//
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingUserProfile")
	private Set<EmployeeDetails> mappingEmployeeDetails;
	
	
//	@OneToMany(targetEntity = RevenueDetail.class)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private Set<RevenueDetail> RevenueDetail;
//
	
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingUserProfile")
	private Set<RevenueDetail> mappingRevenueDetail;
	
	
	
//	@OneToMany(targetEntity = UserTestDetails.class)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private Set<UserTestDetails> UserTestDetails;
//
	
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingUserProfile")
	private Set<UserTestDetails> mappingUserTestDetails;
	
	
//	@OneToMany(targetEntity = UserStudent.class)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private Set<UserStudent> UserStudent;
//	
	
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingUserProfile")
	private Set<UserStudent> mappingUserStudent;
	
	
//	
//	@OneToMany(targetEntity = CourseFeedback.class)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private Set<CourseFeedback> CourseFeedback;
//
	
	
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingUserProfile")
	private Set<CourseFeedback> mappingCourseFeedback;
	
	
//////////////////////////////
//
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userCategoryId", nullable = false)
	private UserProfile mappingUserCategory;
	
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "timeSlotsId", nullable = false)
	private TimeSlots mappingTimeSlots;
	
	
	
	
	
	
//	
	

}
