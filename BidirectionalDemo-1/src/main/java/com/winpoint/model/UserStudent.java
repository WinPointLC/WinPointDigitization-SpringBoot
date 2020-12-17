package com.winpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class UserStudent {
//	checked
//	redo fk

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userStudentId", updatable=false)	
	private Integer userStudentId;
	private Integer userId;
	private String parentName;
	private String parentMobileNumber;
//	private Integer clientCategoryId;
	private Integer createdBy;
	private Date createdDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clientCategoryId", nullable = false)
	private ClientCategory mappingClientCategory;


}
