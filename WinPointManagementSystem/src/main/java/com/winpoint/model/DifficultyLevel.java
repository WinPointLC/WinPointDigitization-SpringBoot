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
import javax.persistence.OneToMany;

import lombok.Data;
//checked//
@Entity
@Data
public class DifficultyLevel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="difficultyLevelId", updatable=false)
	private Integer difficultyLevelId;
	private String difficultyLevelName;
	private Integer createdBy;
	private Date createdDate;

//	@OneToMany(targetEntity = GeneralAptitudeQuestionBank.class)
//	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
//	private Set<GeneralAptitudeQuestionBank> mappingGeneralAptitudeQuestionBank;
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingDifficultyLevel")
	private Set<GeneralAptitudeQuestionBank> mappingGeneralAptitudeQuestionBank;

	
//	@OneToMany(targetEntity = SoftSkillsQuestionBank.class)
//	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
//	private Set<SoftSkillsQuestionBank> mappingSoftSkillsQuestionBank;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingDifficultyLevel")
	private Set<SoftSkillsQuestionBank> mappingSoftSkillsQuestionBank;
	
//	@OneToMany(targetEntity = TechnicalQuestionBank.class)
//	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
//	private Set<TechnicalQuestionBank> mappingTechnicalQuestionBank;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingDifficultyLevel")
	private Set<TechnicalQuestionBank> mappingTechnicalQuestionBank;
	
//	@OneToMany(targetEntity = TestDifficulty.class)
//	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
//	private Set<TestDifficulty> mappingTestDifficulty;
	

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingDifficultyLevel")
	private Set<TestDifficulty> mappingTestDifficulty;	
}
