package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class SecurityQuestions {
//	checked
	@Id
	private Integer securityQuestionId;
	private String securityQuestion;
	private Integer createdBy;
	private Date createdDate;
	

//	@OneToMany(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "securityQuestionId", referencedColumnName = "securityQuestionId")
//	private List<UserProfile> UserProfile;
	
	//////////////////////

}