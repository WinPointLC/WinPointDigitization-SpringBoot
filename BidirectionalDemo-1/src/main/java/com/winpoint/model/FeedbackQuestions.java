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
public class FeedbackQuestions {
//	checked//
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "feedbackQuestionId", updatable = false)
	private Integer feedbackQuestionId;
//	private Integer feedbackCategoryId;
	private String feedbackQuestion;
	private Integer feedbackQuestionTypeId;
	private Integer createdBy;
	private Date createdDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "feedbackCategoryId", nullable = false)
	private FeedbackCategory mappingFeedbackCategory;

//	@OneToMany(targetEntity = FeedbackQuestions.class)
//	@JoinColumn(name = "feedbackQuestionId", referencedColumnName = "feedbackQuestionId")
//	private Set<TestFeedback> TestFeedback;

//	@OneToMany(targetEntity = CourseFeedback.class)
//	@JoinColumn(name = "feedbackQuestionId", referencedColumnName = "feedbackQuestionId")
//	private Set<CourseFeedback> CourseFeedback;
//	
//	/////////////////

}
