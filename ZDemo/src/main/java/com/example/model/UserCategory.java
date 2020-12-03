package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

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
	
//	@OneToMany(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userCategoryId", referencedColumnName = "userCategoryId")
//	private List<UserProfile> UserProfile;
	
	///////////////////
}
