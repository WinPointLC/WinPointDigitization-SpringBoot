package com.winpoint.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class FeedbackQuestions {
//	checked//
	@Id
	private Integer feedbackQuestionId;
	private Integer feedbackCategoryId;
	private String feedbackQuestion;
	private Integer feedbackQuestionTypeId;
	private Integer createdBy;
	private Date createdDate;

	
	
	
//	@OneToMany(targetEntity = FeedbackQuestions.class)
//	@JoinColumn(name = "feedbackQuestionId", referencedColumnName = "feedbackQuestionId")
//	private Set<TestFeedback> TestFeedback;
	
	
//	@OneToMany(targetEntity = CourseFeedback.class)
//	@JoinColumn(name = "feedbackQuestionId", referencedColumnName = "feedbackQuestionId")
//	private Set<CourseFeedback> CourseFeedback;
//	
//	/////////////////
	

}
