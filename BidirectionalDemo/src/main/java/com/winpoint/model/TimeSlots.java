package com.winpoint.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TimeSlots {
//	checked 
	@Id
	@GeneratedValue
	private Integer timeSlotsId;
	private String timeSlotsDescription;
	
	
//	@OneToMany(targetEntity = EnquiryDetails.class)
//	@JoinColumn(name = "timeSlotsId", referencedColumnName = "timeSlotsId")
//	private Set<EnquiryDetails> mappingEnquiryDetails;
//	
//	
//	
//	@OneToMany(targetEntity = UserProfile.class)
//	@JoinColumn(name = "timeSlotsId", referencedColumnName = "timeSlotsId")
//	private Set<UserProfile> mappingUserProfile;
	
	
	
//////////////////////
}
