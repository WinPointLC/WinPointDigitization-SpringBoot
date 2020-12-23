package com.winpoint.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TestDifficulty {
//	checked
//	fk

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "testDifficultyLevelId", updatable = false)
	private Integer testDetailId; // comp pk
	private Integer numberOfQuestions;
	private Integer createdBy;
	private Date createdDate;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTestDetails")
	private Set<TestDifficulty> mappingTestDifficulty;

//	@OneToMany(targetEntity = TestDetails.class)
//	@JoinColumn(name = "testDetailId", referencedColumnName = "testDetailId")
//	private Set<TestDetails> TestDetails;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTestDifficulty")
	private Set<TestDetails> mappingTestDetails;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "topicId", nullable = false)
	private Topics mappingTopics;

}
