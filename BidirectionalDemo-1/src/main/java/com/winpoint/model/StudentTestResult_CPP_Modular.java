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
public class StudentTestResult_CPP_Modular {
//	checked
//	fk
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="StudentTestResult_CPP_ModularId", updatable=false)	
	Integer StudentTestResult_CPP_ModularId;
	private Integer qNumber;
	private Integer questionId;
	private Character studentResponse;
	private String isCorrect;
	private Integer createdBy;
	private Date createdDate;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userTestId", nullable = false)
	private UserTestDetails mappingUserTestDetails;

}
