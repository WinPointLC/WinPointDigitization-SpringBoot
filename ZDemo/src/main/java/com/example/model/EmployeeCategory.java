package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
//checked
@Entity
@Data
public class EmployeeCategory {
	@Id
	private Integer employeeCategoryId;
	private String employeeCategoryName;
	private Integer createdBy;
	private Date createdDate;

	
	
//	@OneToMany(targetEntity = EmployeeCategory.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "employeeCategoryId", referencedColumnName = "employeeCategoryId")
//	private List<EmployeeDetails> EmployeeDetails;
	
	//////////////////

}
