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
import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@Column(columnDefinition = "datetime")
	private Date createdDate;

	
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingDifficultyLevel")
	private Set<GeneralAptitudeQuestionBank> mappingGeneralAptitudeQuestionBank;

	
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingDifficultyLevel")
	private Set<SoftSkillsQuestionBank> mappingSoftSkillsQuestionBank;

	
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingDifficultyLevel")
	private Set<TechnicalQuestionBank> mappingTechnicalQuestionBank;

}
