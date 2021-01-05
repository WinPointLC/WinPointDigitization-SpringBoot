package com.winpoint.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Topics implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "topicId", updatable = false)
	private Integer topicId;
	private String topicName;
	private Integer minimumNoOfQuestionsForTest;
	private Integer createdBy;
	@Column(columnDefinition = "datetime")
	private Date createdDate;
	private Integer topicDuration;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coursePlansId", nullable = false)
	private CoursePlans mappingCoursePlans;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTopics")
	private Set<GeneralAptitudeQuestionBank> mappingGeneralAptitudeQuestionBank;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTopics")
	private Set<SoftSkillsQuestionBank> mappingSoftSkillsQuestionBank;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTopics")
	private Set<TechnicalQuestionBank> mappingTechnicalQuestionBank;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingTopics")
	private Set<TestDifficulty> mappingTestDifficulty;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "coursePlanTopics", joinColumns = @JoinColumn(name = "topicId"), inverseJoinColumns = @JoinColumn(name = "coursePlansId "))
	List<CoursePlans> mappingCoursePlan = new ArrayList<>();

	
	@JsonIgnore
	@ManyToMany(mappedBy = "mappingTopicsCovered")
	private List<Lecture> mappingLectureCoveredIn = new ArrayList<>();

}
