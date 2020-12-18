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
public class TestDifficulty {
//	checked
//	fk

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="testDifficultyLevelId", updatable=false)	
	private Integer testDifficultyLevelId;
	private Integer testDetailId; // comp pk
	private Integer numberOfQuestions;
	private Integer createdBy;
	private Date createdDate;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "difficultyLevelId", nullable = false)
	private DifficultyLevel mappingDifficultyLevel;

	
//	@OneToMany(targetEntity = TestDetails.class)
//	@JoinColumn(name = "testDetailId", referencedColumnName = "testDetailId")
//	private Set<TestDetails> TestDetails;
	

	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topicId", nullable = false)
	private Topics mappingTopics;

}
