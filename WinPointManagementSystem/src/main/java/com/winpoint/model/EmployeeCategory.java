package com.winpoint.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
//checked
@Entity
@Data
public class EmployeeCategory {
	@Id
	@GeneratedValue
	private Integer employeeCategoryId;
	private String employeeCategoryName;
	private Integer createdBy;
	private Date createdDate;

	@OneToMany(targetEntity = EmployeeDetails.class)
	@JoinColumn(name = "employeeCategoryId", referencedColumnName = "employeeCategoryId")
	private Set<EmployeeDetails> mappingEmployeeDetails;
	
	
	
	//////////////////

}
