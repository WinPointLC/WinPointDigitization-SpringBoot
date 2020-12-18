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
public class TestFeedback {
//	checked
//	fk redo

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="testFeebackId", updatable=false)	
	private Integer testFeebackId;
	private Integer userTestId;
//	private Integer feedbackQuestionId;
	private String response;
	private Integer createdBy;
	private Date createdDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "feedbackQuestionId", nullable = false)
	private FeedbackQuestions mappingFeedbackQuestions;

	
}
