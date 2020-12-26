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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data
public class Topics {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "topicId", updatable = false)
	private Integer topicId;
	private String topicName;
	private Integer minimumNoOfQuestionsForTest;
	private Integer createdBy;
	private Date createdDate;
	private Integer topicDuration;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", nullable = false)
	@JsonManagedReference
	private Course mappingCourse;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTopics")
	@JsonBackReference
	private Set<GeneralAptitudeQuestionBank> mappingGeneralAptitudeQuestionBank;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTopics")
	@JsonBackReference
	private Set<SoftSkillsQuestionBank> mappingSoftSkillsQuestionBank;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTopics")
	@JsonBackReference
	private Set<TechnicalQuestionBank> mappingTechnicalQuestionBank;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTopics")
	@JsonBackReference
	private Set<TestDifficulty> mappingTestDifficulty;

}
