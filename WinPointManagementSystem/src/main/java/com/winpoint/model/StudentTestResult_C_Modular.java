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

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StudentTestResult_C_Modular {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StudentTestResult_C_Modular", updatable = false)
	private Integer StudentTestResult_C_ModularId;
	private Integer qNumber;
	private Character studentResponse;
	private String isCorrect;
	private Integer createdBy;
	private Date createdDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userTestId", nullable = false)
	private UserTestDetails mappingUserTestDetails;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "questionId", nullable = false)
	private TechnicalQuestionBank mappingTechnicalQuestionBank;

}
