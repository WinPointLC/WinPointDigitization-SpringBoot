package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TimeSlots {
//	checked 
	@Id
	private Integer timeSlotsId;
	private String timeSlotsDescription;
	
	
//	@OneToMany(targetEntity = EnquiryDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "timeSlotsId", referencedColumnName = "timeSlotsId")
//	private List<EnquiryDetails> EnquiryDetails;
//	
//	
//	
//	@OneToMany(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "timeSlotsId", referencedColumnName = "timeSlotsId")
//	private List<UserProfile> UserProfile;
	
	
	
//////////////////////
}
