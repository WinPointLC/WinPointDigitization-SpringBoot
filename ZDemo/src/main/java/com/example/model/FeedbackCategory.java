package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class FeedbackCategory {
//	checked//
	@Id
	private Integer feedbackCategoryId;
	private String feedbackCategoryDescription;

	
//	@OneToMany(targetEntity = FeedbackQuestions.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "feedbackCategoryId", referencedColumnName = "feedbackCategoryId")
//	private List<FeedbackQuestions> FeedbackQuestions;
	
	///////////////////
}
