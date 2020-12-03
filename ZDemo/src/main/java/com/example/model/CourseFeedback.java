package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
//checked
//fk remain
@Entity
@Data
public class CourseFeedback {
	
	@Id
	private Integer courseFeedbackId;
	private Integer userId;		//this both two are composite key s
	private Integer courseId;		
	private Integer feedbackQuestionId;
	private String response;
	private String markedForReview;
	private Integer createdBy;
	private Date createdDate;
	
//	@OneToMany(targetEntity = UserProfile.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private List<UserProfile> userProfile;
//	
//	@OneToMany(targetEntity = Course.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<Course> courses;
//	
//	@OneToMany(targetEntity = FeedbackQuestions.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "feedbackQuestionId", referencedColumnName = "feedbackQuestionId")
//	private List<FeedbackQuestions> feedbackQuestions;
//	
}