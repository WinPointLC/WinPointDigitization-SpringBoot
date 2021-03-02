package com.winpoint.model;

import java.util.Date;
import java.util.HashSet;
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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators .PropertyGenerator.class, property="courseName")
public class Course{// implements Serializable{
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
	@Column(columnDefinition = "datetime")
	private Date createdDate;
	private String logoLocation;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "evaluationTypeId", nullable = false)
	private EvaluationType mappingEvaluationType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseTypeId", nullable = false)
	private CourseType mappingCourseType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "streamId", nullable = false)
	private Streams mappingStreams;

	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<StudentCourseDetails> mappingStudentCourseDetails;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "mappingCourse")
	private Set<BatchDetails> mappingBatchDetails;

	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "mappingCourse")
	public Set<CoursePlans> mappingCoursePlans;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<ExpenseDetails> mappingExpenseDetails;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<GeneralAptitudeQuestionBank> mappingGeneralAptitudeQuestionBank;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<RevenueDetail> mappingRevenueDetail;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<SoftSkillsQuestionBank> mappingSoftSkillsQuestionBank;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<TechnicalQuestionBank> mappingTechnicalQuestionBank;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private List<Topics> mappingTopics;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<TestDetails> mappingTestDetails;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<CourseFeedback> mappingCourseFeedback;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "mappingCourseInterestedIn")
	Set<EnquiryDetails> mappingInterestedEnquiryDetails = new HashSet<>();
	
	@JsonIgnore
	@ManyToMany(mappedBy = "mappingCoursesAlreadyDone")
	Set<EnquiryDetails> mappingCoursesDoneEnquiryDetails = new HashSet<>();
	
	@JsonIgnore
	@ManyToMany(mappedBy = "mappingUserCoursesAlreadyDone")
	Set<UserProfile> mappingUserCoursesDoneEnquiryDetails = new HashSet<>();

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + "]";
	}
	
	
}
