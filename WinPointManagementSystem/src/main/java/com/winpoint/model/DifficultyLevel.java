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

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DifficultyLevel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "difficultyLevelId", updatable = false)
	private Integer difficultyLevelId;
	private String difficultyLevelName;
	private Integer createdBy;
	private Date createdDate;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingDifficultyLevel")
	private Set<GeneralAptitudeQuestionBank> mappingGeneralAptitudeQuestionBank;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingDifficultyLevel")
	private Set<SoftSkillsQuestionBank> mappingSoftSkillsQuestionBank;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingDifficultyLevel")
	private Set<TechnicalQuestionBank> mappingTechnicalQuestionBank;


	
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "difficultyLevelId", nullable = false)
//	private DifficultyLevel mappingDifficultyLevel;

	
}

