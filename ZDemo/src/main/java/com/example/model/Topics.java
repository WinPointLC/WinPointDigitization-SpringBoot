package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Topics {
//	checked
//	fk
	@Id
	private Integer topicId;
	private Integer courseId;		//comp pk check
	private String topicName;
	private Integer minimumNoOfQuestionsForTest;
	private Integer createdBy;
	private Date createdDate;
	private Integer topicDuration;
	
	
	
//	@OneToMany(targetEntity = GeneralAptitudeQuestionBank.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
//	private List<GeneralAptitudeQuestionBank> GeneralAptitudeQuestionBank;
//	
//	
//	@OneToMany(targetEntity = SoftSkillsQuestionBank.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
//	private List<SoftSkillsQuestionBank> SoftSkillsQuestionBank;
//	
//	
//	@OneToMany(targetEntity = Topics.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
//	private List<TechnicalQuestionBank> TechnicalQuestionBank;
//	
//	@OneToMany(targetEntity = Topics.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "topicId", referencedColumnName = "topicId")
//	private List<TestDifficulty> TestDifficulty;
	
	
	/////////////////////////

	
	@ManyToOne
	private Course Course;
	
	
	
	
	
	
	
	
	
}
