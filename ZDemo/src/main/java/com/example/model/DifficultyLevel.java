package com.example.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
//checked//
@Entity
@Data
public class DifficultyLevel {
	@Id
	private Integer difficultyLevelId;
	private String difficultyLevelName;
	private Integer createdBy;
	private Date createdDate;
	

	@OneToMany(targetEntity = GeneralAptitudeQuestionBank.class)
	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
	private Set<GeneralAptitudeQuestionBank> GeneralAptitudeQuestionBank;
	
	
	@OneToMany(targetEntity = SoftSkillsQuestionBank.class)
	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
	private Set<SoftSkillsQuestionBank> SoftSkillsQuestionBank;
	
	
	@OneToMany(targetEntity = DifficultyLevel.class)
	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
	private Set<TechnicalQuestionBank> TechnicalQuestionBank;
	
	
	@OneToMany(targetEntity = DifficultyLevel.class)
	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
	private Set<TestDifficulty> TestDifficulty;
	
	////////////////////////////
}
