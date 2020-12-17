package com.winpoint.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class FeedbackQuestionType {
//	checked
	@Id
	@GeneratedValue
	private Integer feedbackQuestionTypeId;
	private String feedbackQuestionType;
	
	
	
//	@OneToMany(targetEntity = FeedbackQuestions.class)
//	@JoinColumn(name = "feedbackQuestionTypeId", referencedColumnName = "feedbackQuestionTypeId")
//	private Set<FeedbackQuestions> mappingFeedbackQuestions;
	
	////////////////////
	
}
