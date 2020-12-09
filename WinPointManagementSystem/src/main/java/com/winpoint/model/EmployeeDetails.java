package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

//checked
//TO DO
@Entity
@Data
public class EmployeeDetails {
	@Id
	private Integer employeeDetailsId;
	private Integer userId;
	private Double employeeSalary;
	private String dateOfJoining;
	private Integer employeeCategoryId;
	private Integer createdBy;
	private Date createdDate;


	
}
