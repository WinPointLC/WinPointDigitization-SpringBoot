package com.winpoint.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class FeedbackQuestionType {
//	checked
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="feedbackQuestionTypeId", updatable=false)
	private Integer feedbackQuestionTypeId;
	private String feedbackQuestionType;
	
	
	
//	@OneToMany(targetEntity = FeedbackQuestions.class)
//	@JoinColumn(name = "feedbackQuestionTypeId", referencedColumnName = "feedbackQuestionTypeId")
//	private Set<FeedbackQuestions> mappingFeedbackQuestions;
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingFeedbackQuestionType")
	private Set<FeedbackQuestions> mappingFeedbackQuestions;}
