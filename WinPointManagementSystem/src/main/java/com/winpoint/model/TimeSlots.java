package com.winpoint.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class TimeSlots {
//	checked 
	@Id
	private Integer timeSlotsId;
	private String timeSlotsDescription;
	
	
	@OneToMany(targetEntity = EnquiryDetails.class)
	@JoinColumn(name = "timeSlotsId", referencedColumnName = "timeSlotsId")
	private Set<EnquiryDetails> mappingEnquiryDetails;
	
	
	
	@OneToMany(targetEntity = UserProfile.class)
	@JoinColumn(name = "timeSlotsId", referencedColumnName = "timeSlotsId")
	private Set<UserProfile> mappingUserProfile;
	
	
	
//////////////////////
}
