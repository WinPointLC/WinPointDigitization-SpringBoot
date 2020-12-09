package com.winpoint.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class UserCategory {	
//	checked
	@Id
	private Integer userCategoryId;
	private String userCategoryName;
	private Integer createdBy;
	private Date createdDate;
	
	@OneToMany(targetEntity = UserProfile.class)
	@JoinColumn(name = "userCategoryId", referencedColumnName = "userCategoryId")
	private Set<UserProfile> mappingUserProfile;
	
	///////////////////
}
