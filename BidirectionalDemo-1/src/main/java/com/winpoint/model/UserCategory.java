package com.winpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class UserCategory {	
//	checked
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userCategoryId", updatable=false)	
	private Integer userCategoryId;
	private String userCategoryName;
	private Integer createdBy;
	private Date createdDate;
	
//	@OneToMany(targetEntity = UserProfile.class)
//	@JoinColumn(name = "userCategoryId", referencedColumnName = "userCategoryId")
//	private Set<UserProfile> mappingUserProfile;
	
	///////////////////
}
