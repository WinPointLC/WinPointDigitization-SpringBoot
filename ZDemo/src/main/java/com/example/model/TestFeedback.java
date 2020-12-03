package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TestFeedback {
//	checked
//	fk redo

	@Id
	private Integer testFeebackId;
	private Integer userTestId;
	private Integer feedbackQuestionId;
	private String response;
	private Integer createdBy;
	private Date createdDate;

//	@ManyToOne
//	private FeedbackQuestions FeedbackQuestions;
//
//	@ManyToOne
//	private UserTestDetails UserTestDetails;

}
