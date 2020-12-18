package com.winpoint.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingUserCategory")
	private Set<UserProfile> mappingUserProfile;
	
	///////////////////
}
