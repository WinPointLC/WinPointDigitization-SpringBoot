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
import javax.persistence.OneToMany;

import lombok.Data;

//checked
//one error
@Entity
@Data
public class BatchDetails {
//	checked//
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="batchId", updatable=false)
	private Integer batchId;
	private Integer courseId;
	private Integer facultyUserId;
	private Date beginDate;
	private Date endDate;
	private Integer createdBy;
	private Date createdDate;
	private String batchName;
	private Integer batchTime;
	private Integer currentLectureNumber;
	private String lectureDuration;
	private Integer totalNumberOfLectures;
	private Integer segmentTypeId;


//	@OneToMany(targetEntity = StudentCourseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "batchId", referencedColumnName = "batchId")
//	private Set<StudentCourseDetails> StudentCourseDetails;
//
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingBatchDetails")
	private Set<StudentCourseDetails> StudentCourseDetails;

	
//	@OneToMany(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "batchId", referencedColumnName = "batchId")
//	private Set<ExpenseDetails> ExpenseDetails;
//
//	@OneToMany(targetEntity = Lecture.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "batchId", referencedColumnName = "batchId")
//	private Set<Lecture> Lecture;
//
//	@OneToMany(targetEntity = RevenueDetail.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "batchId", referencedColumnName = "batchId")
//	private Set<RevenueDetail> RevenueDetail;

//	/////////////////////////
	

}
