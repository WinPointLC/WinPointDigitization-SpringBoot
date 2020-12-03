package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class SoftSkillsQuestionBank {
//	checked
//	fk
	@Id
	private String questionId;
	private String courseId;
	private String topicId;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private Character correctOption;
	private Integer marks;
	private String explanation;
	private Integer difficultyLevelId;
	private String inCrt;
	private String createdBy;
	private Date createdDate;

//	@ManyToOne
//	private Course Course;
//
//	@ManyToOne
//	private Topics Topics;
//
//	@ManyToOne
//	private DifficultyLevel DifficultyLevel;

}
