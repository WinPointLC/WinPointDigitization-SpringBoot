package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EnquiryDetails {
//	creation of fk
//	schema checked
	@Id
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
	private Integer timeSlotsId;
	private String courseAlreadyDone;
	private Date startDate;
	private Integer segmentTypeId;
	private String suggestion;
	private Integer activeStatus;

	

}
