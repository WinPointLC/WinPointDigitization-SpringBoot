package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TestDifficulty {
//	checked
//	fk

	@Id
	private Integer testDifficultyLevelId;
	private Integer testDetailId; // comp pk
	private Integer topicId;
	private Integer difficultyLevelId;
	private Integer numberOfQuestions;
	private Integer createdBy;
	private Date createdDate;

//	@ManyToOne
//	private TestDetails TestDetails;
//
//	@ManyToOne
//	private Topics Topics;
//
//	@ManyToOne
//	private DifficultyLevel DifficultyLevel;

}
