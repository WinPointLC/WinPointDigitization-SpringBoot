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
import javax.persistence.OneToMany;

import lombok.Data;

//checked//
@Entity
@Data
public class Course{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="courseId", updatable=false)
	private Integer courseId;
	private String courseName;
	private String preRequisite;
	private Integer courseDuration;
	private Integer courseFees;
	private Integer streamId;
	private Integer courseTypeId;
	private String coursewareExist;
	private Integer evaluationTypeId;
	private Integer totalTests;
	private Integer createdBy;
	private Date createdDate;
	private Integer logoLocation;
	
//	@OneToMany(targetEntity = StudentCourseDetails.class)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private Set<StudentCourseDetails> StudentCourseDetails;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingCourse")
	private Set<StudentCourseDetails> StudentCourseDetails;
	
//	@OneToMany(targetEntity = BatchDetails.class)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private Set<BatchDetails> BatchDetails;
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingCourse")
	private Set<BatchDetails> BatchDetails;

//	@OneToMany(targetEntity = Course.class)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private Set<CoursePlans> CoursePlans;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingCourse")
	private Set<CoursePlans> CoursePlans;
	
//	@OneToMany(targetEntity = ExpenseDetails.class)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private Set<ExpenseDetails> ExpenseDetails;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingCourse")
	private Set<ExpenseDetails> ExpenseDetails;
	
//	@OneToMany(targetEntity = GeneralAptitudeQuestionBank.class)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private Set<GeneralAptitudeQuestionBank> GeneralAptitudeQuestionBank;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingCourse")
	private Set<GeneralAptitudeQuestionBank> GeneralAptitudeQuestionBank;
	
//	@OneToMany(targetEntity = RevenueDetail.class)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private Set<RevenueDetail> RevenueDetail;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingCourse")
	private Set<RevenueDetail> RevenueDetail;

//	@OneToMany(targetEntity = SoftSkillsQuestionBank.class)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private Set<SoftSkillsQuestionBank> SoftSkillsQuestionBank;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingCourse")
	private Set<SoftSkillsQuestionBank> SoftSkillsQuestionBank;
	
//	@OneToMany(targetEntity = Course.class)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private Set<TechnicalQuestionBank> TechnicalQuestionBank;

//	@OneToMany(cascade = CascadeType.ALL, 
//			  fetch = FetchType.LAZY, 
//			  mappedBy = "mappingCourse")
//	private Set<TechnicalQuestionBank> TechnicalQuestionBank;
	
//	@OneToMany(targetEntity = Topics.class)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private Set<Topics> Topics;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingCourse")
	private Set<Topics> Topics;
	
//	@OneToMany(targetEntity = TestDetails.class)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private Set<TestDetails> TestDetails;	

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingCourse")
	private Set<TestDetails> TestDetails;
	
//	@OneToMany(targetEntity = CourseFeedback.class)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private Set<CourseFeedback> CourseFeedback;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingCourse")
	private Set<CourseFeedback> CourseFeedback;
	
//	///////////////////////////////
//
	

}
