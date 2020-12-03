package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

//checked//
@Entity
@Data
public class Course {
	@Id
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
	
//	@OneToMany(targetEntity = StudentCourseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<StudentCourseDetails> StudentCourseDetails;
//
//	@OneToMany(targetEntity = BatchDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<BatchDetails> BatchDetails;
//
//	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<CoursePlans> CoursePlans;
//
//	@OneToMany(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<ExpenseDetails> ExpenseDetails;
//	
//	
//	@OneToMany(targetEntity = GeneralAptitudeQuestionBank.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<GeneralAptitudeQuestionBank> GeneralAptitudeQuestionBank;
//	
//	
//	@OneToMany(targetEntity = RevenueDetail.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<RevenueDetail> RevenueDetail;
//	
//	@OneToMany(targetEntity = SoftSkillsQuestionBank.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<SoftSkillsQuestionBank> SoftSkillsQuestionBank;
//	
//	@OneToMany(targetEntity = StudentCourseFeesBean.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<StudentCourseFeesBean> StudentCourseFeesBean;
//	
//	
//	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<TechnicalQuestionBank> TechnicalQuestionBank;
//	
//	
//	@OneToMany(targetEntity = Topics.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<Topics> Topics;
//	
//	@OneToMany(targetEntity = TestDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "courseId", referencedColumnName = "courseId")
//	private List<TestDetails> TestDetails;	
//
//	///////////////////////////////
//
//	@ManyToOne
//	private Streams stream;
//
//	@ManyToOne
//	private CourseType courseType;
//
//	@ManyToOne
//	private EvaluationType EvaluationType;

}
