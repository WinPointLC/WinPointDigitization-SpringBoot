package com.winpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EnquiryDetails {
//	creation of fk
//	schema checked
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "enquiryId", updatable = false)
	private Integer enquiryId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String MobileNo;
	private String address;
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
	private Date dateOfEnquiry;
	private String gender;
	private Integer yearOfGraduation;
	private String recommendation;
	private String eligibility;
	private String courseInterestedIn;
	private String reference;
	private String courseAlreadyDone;
	private Date startDate;
	private String suggestion;
	private Integer activeStatus;
	private String birthDateString;
	private String dateOfEnquiryString;
	private String startDateString;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "segmentTypeId", nullable = false)
	@JsonManagedReference
	private SegmentType mappingSegmentType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "timeSlotsId", nullable = false)
	@JsonManagedReference
	private TimeSlots mappingTimeSlots;

}
