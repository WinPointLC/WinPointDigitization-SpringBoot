package com.winpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class GeneralAptitudeQuestionBank {
//	checked//
//	fk
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="questionId", updatable=false)
	private Integer questionId;
//	private Integer courseId;
	private Integer topicId;
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

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseTypeId", nullable = false)
	private CourseType mappingCourse;

}
