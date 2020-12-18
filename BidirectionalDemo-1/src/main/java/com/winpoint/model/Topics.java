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

import lombok.Data;

@Entity
@Data
public class Topics {
//	checked
//	fk
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="topicId", updatable=false)	
	private Integer topicId;
	private String topicName;
	private Integer minimumNoOfQuestionsForTest;
	private Integer createdBy;
	private Date createdDate;
	private Integer topicDuration;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;
	
//	@OneToMany(targetEntity = GeneralAptitudeQuestionBank.class)
//	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
//	private Set<GeneralAptitudeQuestionBank> GeneralAptitudeQuestionBank;
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingTopics")
	private Set<GeneralAptitudeQuestionBank> mappingGeneralAptitudeQuestionBank;
//	
//	
//	@OneToMany(targetEntity = SoftSkillsQuestionBank.class)
//	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
//	private Set<SoftSkillsQuestionBank> SoftSkillsQuestionBank;
//	
	
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingTopics")
	private Set<SoftSkillsQuestionBank> mappingSoftSkillsQuestionBank;
	
	
	
//	
//	@OneToMany(targetEntity = Topics.class)
//	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
//	private Set<TechnicalQuestionBank> TechnicalQuestionBank;
//	
	
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingTopics")
	private Set<TechnicalQuestionBank> mappingTechnicalQuestionBank;
	
	
	
//	@OneToMany(targetEntity = Topics.class)
//	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
//	private Set<TestDifficulty> TestDifficulty;
	
	
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingTopics")
	private Set<TestDifficulty> mappingTestDifficulty;
	
	
	
	/////////////////////////

	
	
	
	
	
	
	
	
	
	
}
