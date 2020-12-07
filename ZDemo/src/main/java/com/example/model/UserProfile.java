package com.example.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class UserProfile {
//	checked
//	redo fk
	@Id
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
	private Integer securityQuestionId;
	private String securityQuestion;
	private String securityAnswer;
	private Integer userCategoryId;
	private String occupation;
	private String organization;
	private String designation;
	private String domain;
	private String role;
	private Integer experience;
	private Integer createdBy;
	private Date createDate;
	private Integer timeSlotsId;
	private Integer segmentTypeId;
	private String courseAlreadyDone;
	private Boolean activeStatus;
	
	@OneToMany(targetEntity = FacultySkills.class)
	@JoinColumn(name = "facultyUserId", referencedColumnName = "userId")
	private Set<FacultySkills> FacultySkills;

	@OneToMany(targetEntity = StudentCourseDetails.class)
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private Set<StudentCourseDetails> StudentCourseDetails;

//	@OneToMany(targetEntity = UserProfile.class)
//	@JoinColumn(name = "facultyUserId", referencedColumnName = "userId")
//	private Set<UserProfile> employeeCategories;

	@OneToMany(targetEntity = EmployeeDetails.class)
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private Set<EmployeeDetails> EmployeeDetails;

	@OneToMany(targetEntity = RevenueDetail.class)
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private Set<RevenueDetail> RevenueDetail;

	@OneToMany(targetEntity = UserTestDetails.class)
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private Set<UserTestDetails> UserTestDetails;

	@OneToMany(targetEntity = UserStudent.class)
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private Set<UserStudent> UserStudent;
	
	
	@OneToMany(targetEntity = CourseFeedback.class)
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private Set<CourseFeedback> CourseFeedback;
//
//////////////////////////////
//
	

}
