package com.winpoint.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class SecurityQuestions {
//	checked
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="securityQuestion", updatable=false)	
	private Integer securityQuestionId;
	private Integer createdBy;
	private Date createdDate;
	

//	@OneToMany(targetEntity = UserProfile.class)
//	@JoinColumn(name = "securityQuestionId", referencedColumnName = "securityQuestionId")
//	private Set<UserProfile> mappingUserProfile;
	
	//////////////////////

}