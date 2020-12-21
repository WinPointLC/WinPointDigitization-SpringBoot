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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
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
	private Course mappingCourseType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "streamId", nullable = false)
	private Streams mappingStreams;

//	private Integer evaluationTypeId = mappingEvaluationType.getEvaluationTypeId();
//	private Integer courseTypeId = mappingCourseType.getCourseTypeId();
//	private Integer streamId = mappingStreams.getStreamId();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<StudentCourseDetails> StudentCourseDetails;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<BatchDetails> BatchDetails;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<CoursePlans> CoursePlans;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<ExpenseDetails> ExpenseDetails;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<GeneralAptitudeQuestionBank> GeneralAptitudeQuestionBank;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<RevenueDetail> RevenueDetail;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<SoftSkillsQuestionBank> SoftSkillsQuestionBank;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<TechnicalQuestionBank> TechnicalQuestionBank;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<Topics> Topics;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<TestDetails> TestDetails;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCourse")
	private Set<CourseFeedback> CourseFeedback;

}
