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
public class FeedbackCategory {
//	checked//
	@Id
	@GeneratedValue
	private Integer feedbackCategoryId;
	private String feedbackCategoryDescription;

	
//	@OneToMany(targetEntity = FeedbackQuestions.class)
	@JoinColumn(name = "feedbackCategoryId", referencedColumnName = "feedbackCategoryId")
	private Set<FeedbackQuestions> mappingFeedbackQuestions;
	
	///////////////////
}
