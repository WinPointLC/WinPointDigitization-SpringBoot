package com.winpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private Integer courseId;		//comp pk check
	private String topicName;
	private Integer minimumNoOfQuestionsForTest;
	private Integer createdBy;
	private Date createdDate;
	private Integer topicDuration;
	
	
	
//	@OneToMany(targetEntity = GeneralAptitudeQuestionBank.class)
//	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
//	private Set<GeneralAptitudeQuestionBank> GeneralAptitudeQuestionBank;
//	
//	
//	@OneToMany(targetEntity = SoftSkillsQuestionBank.class)
//	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
//	private Set<SoftSkillsQuestionBank> SoftSkillsQuestionBank;
//	
//	
//	@OneToMany(targetEntity = Topics.class)
//	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
//	private Set<TechnicalQuestionBank> TechnicalQuestionBank;
//	
//	@OneToMany(targetEntity = Topics.class)
//	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
//	private Set<TestDifficulty> TestDifficulty;
	
	
	/////////////////////////

	
	
	
	
	
	
	
	
	
	
}
