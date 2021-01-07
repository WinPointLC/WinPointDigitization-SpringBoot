package com.winpoint.model;

import java.io.Serializable;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder.Default;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Entity
@Getter
@Setter
public class EnquiryDetails implements Serializable{
//	creation of fk
//	schema checked
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "enquiryId", updatable = false)
	private Integer enquiryId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNo;
	private String address;
	@Column(columnDefinition = "datetime")
	private Date birthDate;
	private String college;
	private String degree;
	private String branch;
	private String occupation;
	private String designation;
	private String domain;
	private String role;
	private Integer experience;
	private Integer createdBy;
	@Column(columnDefinition = "datetime")
	private Date dateOfEnquiry;
	private String gender;
	private Integer yearOfGraduation;
	private String recommendation;
	private String eligibility;
	private String reference;
	@Column(columnDefinition = "datetime")
	private Date startDate;
	private String suggestion;
	private Integer activeStatus;
	private String birthDateString;
	private String dateOfEnquiryString;
	private String startDateString;
	private String defaultPassword;
//	private UserCategory userCategoryId;
	private boolean isEnquired;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userCategoryId", nullable = false)
	private UserCategory mappingUserCategory;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "segmentTypeId", nullable = false)
	private SegmentType mappingSegmentType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "timeSlotsId", nullable = false)
	private TimeSlots mappingTimeSlots;
	
	//@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "enquiryDetailsCoursesInterestedIn", joinColumns = @JoinColumn(name = "enquiryId"), inverseJoinColumns = @JoinColumn(name = "courseId "))
	List<Course> mappingCourseInterestedIn = new ArrayList<>();
	
	//@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "enquiryDetailsCoursesAlreadyDone", joinColumns = @JoinColumn(name = "enquiryId"), inverseJoinColumns = @JoinColumn(name = "courseId "))
	List<Course> mappingCoursesAlreadyDone = new ArrayList<>();

}
