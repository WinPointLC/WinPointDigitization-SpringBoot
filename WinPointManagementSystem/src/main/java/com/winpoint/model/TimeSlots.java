package com.winpoint.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TimeSlots {
//	checked 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="timeSlotsId", updatable=false)	
	private Integer timeSlotsId;
	private String timeSlotsDescription;
	
	
//	@OneToMany(targetEntity = EnquiryDetails.class)
//	@JoinColumn(name = "timeSlotsId", referencedColumnName = "timeSlotsId")
//	private Set<EnquiryDetails> mappingEnquiryDetails;
//	
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingTimeSlots")
	private Set<EnquiryDetails> mappingEnquiryDetails;
	
//	
//	
//	@OneToMany(targetEntity = UserProfile.class)
//	@JoinColumn(name = "timeSlotsId", referencedColumnName = "timeSlotsId")
//	private Set<UserProfile> mappingUserProfile;
	
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingTimeSlots")
	private Set<UserProfile> mappingUserProfile;
	
	
//////////////////////
}
