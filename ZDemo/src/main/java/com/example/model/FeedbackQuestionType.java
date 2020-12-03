package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class FeedbackQuestionType {
//	checked
	@Id
	private Integer feedbackQuestionTypeId;
	private String feedbackQuestionType;
	
	
	
//	@OneToMany(targetEntity = FeedbackQuestions.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "feedbackQuestionTypeId", referencedColumnName = "feedbackQuestionTypeId")
//	private List<FeedbackQuestions> FeedbackQuestions;
	
	////////////////////
	
}
