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

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CourseFeedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "courseFeedbackId", updatable = false)
	private Integer courseFeedbackId;
	private String response;
	private String markedForReview;
	private Integer createdBy;
	private Date createdDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", nullable = false)
	@JsonManagedReference
	private Course mappingCourse;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
	@JsonManagedReference
	private UserProfile mappingUserProfile;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "feedbackQuestionId", nullable = false)
	@JsonManagedReference
	private FeedbackQuestions mappingFeedbackQuestions;
	
}