package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentTestResultOperatingSystem_CRT {
//	checked
//	fk
	@Id
	private Integer StudentTestResultOperatingSystem_CRT_Id;
	private Integer userTestId;
	private Integer qNumber;
	private Integer questionId;
	private Character studentResponse;
	private String isCorrect;
	private Integer createdBy;
	private Date createdDate;

}
