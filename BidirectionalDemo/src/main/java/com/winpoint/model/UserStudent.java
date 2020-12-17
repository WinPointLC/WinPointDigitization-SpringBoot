package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class UserStudent {
//	checked
//	redo fk

	@Id
	private Integer userStudentId;
	private Integer userId;
	private String parentName;
	private String parentMobileNumber;
	private Integer clientCategoryId;
	private Integer createdBy;
	private Date createdDate;

}
