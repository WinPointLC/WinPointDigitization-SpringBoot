package com.winpoint.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "courseId", updatable = false)
	private Integer courseId;
	private String courseName;
	private String preRequisite;
	private Integer courseDuration;
	private Integer courseFees;
	private String coursewareExist;
	private Integer totalTests;
	private Integer createdBy;
	private Date createdDate;
	private Integer logoLocation;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "evaluationTypeId", nullable = false)
	private EvaluationType mappingEvaluationType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseTypeId", nullable = false)
	private CourseType mappingCourseType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "streamId", nullable = false)
	private Streams mappingStreams;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<StudentCourseDetails> StudentCourseDetails;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<BatchDetails> BatchDetails;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<CoursePlans> CoursePlans;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<ExpenseDetails> ExpenseDetails;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<GeneralAptitudeQuestionBank> GeneralAptitudeQuestionBank;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<RevenueDetail> RevenueDetail;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<SoftSkillsQuestionBank> SoftSkillsQuestionBank;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<TechnicalQuestionBank> TechnicalQuestionBank;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<Topics> Topics;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<TestDetails> TestDetails;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<CourseFeedback> CourseFeedback;
	
	
	@ManyToMany(mappedBy = "mappingCourseInterestedIn")
	List<EnquiryDetails> mappingInterestedEnquiryDetails = new ArrayList<>();
	
	@ManyToMany(mappedBy = "mappingCoursesAlreadyDone")
	List<EnquiryDetails> mappingCoursesDoneEnquiryDetails = new ArrayList<>();
	
	
}
