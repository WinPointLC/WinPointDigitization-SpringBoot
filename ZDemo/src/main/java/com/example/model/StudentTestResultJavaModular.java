package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentTestResultJavaModular {
//	checked
//	fk
	@Id
	private Integer StudentTestResultJavaModularId;
	private Integer userTestId;
	private Integer qNumber;
	private Integer questionId;
	private Character studentResponse;
	private String isCorrect;
	private Integer createdBy;
	private Date createdDate;

//	@ManyToOne
//	private UserTestDetails UserTestDetails;
//
//	@ManyToOne
//	private TechnicalQuestionBank TechnicalQuestionBank;

}
