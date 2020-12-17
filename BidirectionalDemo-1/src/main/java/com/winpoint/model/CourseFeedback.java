package com.winpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
//checked
//fk remain
@Entity
@Data
public class CourseFeedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="courseFeedbackId", updatable=false)
	private Integer courseFeedbackId;
	private Integer userId;		//this both two are composite key s
	private Integer courseId;		
	private Integer feedbackQuestionId;
	private String response;
	private String markedForReview;
	private Integer createdBy;
	private Date createdDate;

//	
}