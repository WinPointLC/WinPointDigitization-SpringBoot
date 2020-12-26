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

import com.fasterxml.jackson.annotation.JsonBackReference;

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

	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingDifficultyLevel")
	private Set<GeneralAptitudeQuestionBank> mappingGeneralAptitudeQuestionBank;

	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingDifficultyLevel")
	private Set<SoftSkillsQuestionBank> mappingSoftSkillsQuestionBank;

	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingDifficultyLevel")
	private Set<TechnicalQuestionBank> mappingTechnicalQuestionBank;


	
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "difficultyLevelId", nullable = false)
//	private DifficultyLevel mappingDifficultyLevel;

	
}

