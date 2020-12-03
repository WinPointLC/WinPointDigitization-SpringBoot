package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

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
	

//	@OneToMany(targetEntity = GeneralAptitudeQuestionBank.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
//	private List<GeneralAptitudeQuestionBank> GeneralAptitudeQuestionBank;
//	
//	
//	@OneToMany(targetEntity = SoftSkillsQuestionBank.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
//	private List<SoftSkillsQuestionBank> SoftSkillsQuestionBank;
//	
//	
//	@OneToMany(targetEntity = DifficultyLevel.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
//	private List<TechnicalQuestionBank> TechnicalQuestionBank;
//	
//	
//	@OneToMany(targetEntity = DifficultyLevel.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "difficultyLevelId", referencedColumnName = "difficultyLevelId")
//	private List<TestDifficulty> TestDifficulty;
	
	////////////////////////////
}
