package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	private String timeSlotsId;
	private Integer segmentTypeId;
	private String courseAlreadyDone;
	private Boolean activeStatus;

//	@OneToMany(targetEntity = StudentCourseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private List<StudentCourseDetails> StudentCourseDetails;
//
//	@OneToMany(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "facultyUserId", referencedColumnName = "userId")
//	private List<UserProfile> employeeCategories;
//
//	@OneToMany(targetEntity = EmployeeDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private List<EmployeeDetails> EmployeeDetails;
//
//	@OneToMany(targetEntity = RevenueDetail.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private List<RevenueDetail> RevenueDetail;
//
////	@OneToMany(targetEntity = StudentCourseFeesBean.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
////	@JoinColumn(name = "userId", referencedColumnName = "userId")
////	private List<StudentCourseFeesBean> StudentCourseFeesBean;
//
//	@OneToMany(targetEntity = UserTestDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private List<UserTestDetails> UserTestDetails;
//
//	@OneToMany(targetEntity = UserStudent.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private List<UserStudent> UserStudent;
//
//////////////////////////////
//
	@ManyToOne
	private SecurityQuestions SecurityQuestions;

	@ManyToOne
	private UserCategory UserCategory;

	@ManyToOne
	private TimeSlots TimeSlots;

	@ManyToOne
	private SegmentType SegmentType;

}
