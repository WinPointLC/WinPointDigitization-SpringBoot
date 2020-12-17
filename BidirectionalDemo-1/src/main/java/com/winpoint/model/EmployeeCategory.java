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
//checked
@Entity
@Data
public class EmployeeCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employeeCategoryId", updatable=false)
	private Integer employeeCategoryId;
	private String employeeCategoryName;
	private Integer createdBy;
	private Date createdDate;

//	@OneToMany(targetEntity = EmployeeDetails.class)
//	@JoinColumn(name = "employeeCategoryId", referencedColumnName = "employeeCategoryId")
//	private Set<EmployeeDetails> mappingEmployeeDetails;
//	
	
	
	//////////////////

}
