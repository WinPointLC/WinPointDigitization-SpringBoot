package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EnquiryDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int enquiryId;
	private String Name;
	private String courseInterestedIn;
	private Boolean elgibility;
	private String suggestions;
	
	
}
