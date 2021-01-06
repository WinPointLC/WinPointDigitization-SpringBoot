package com.winpoint.model;

import java.io.Serializable;
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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Getter
@Setter
public class BatchDetails implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "batchId", updatable = false)
	private Integer batchId;
	private Integer facultyUserId;
	@Column(columnDefinition = "datetime")
	private Date beginDate;
	@Column(columnDefinition = "datetime")
	private Date endDate;
	private Integer createdBy;
	@Column(columnDefinition = "datetime")
	private Date createdDate;
	private String batchName;
	private Integer batchTime;
	private Integer currentLectureNumber;
	private String lectureDuration;
	private Integer totalNumberOfLectures;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "segmentTypeId", nullable = false)
	private SegmentType mappingSegmentType;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;

	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "mappingBatchDetails")
	private Set<StudentCourseDetails> StudentCourseDetails;

	
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "mappingBatchDetails")
	private Set<ExpenseDetails> ExpenseDetails;

	
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "mappingBatchDetails")
	private Set<Lecture> Lecture;

	
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "mappingBatchDetails")
	private Set<RevenueDetail> RevenueDetail;

}
