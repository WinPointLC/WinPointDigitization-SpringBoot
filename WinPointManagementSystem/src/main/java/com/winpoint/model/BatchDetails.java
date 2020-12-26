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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BatchDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "batchId", updatable = false)
	private Integer batchId;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "segmentTypeId", nullable = false)
	@JsonManagedReference
	private SegmentType mappingSegmentType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", nullable = false)
	@JsonManagedReference
	private Course mappingCourse;

	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingBatchDetails")
	private Set<StudentCourseDetails> StudentCourseDetails;

	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingBatchDetails")
	private Set<ExpenseDetails> ExpenseDetails;

	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingBatchDetails")
	private Set<Lecture> Lecture;

	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingBatchDetails")
	private Set<RevenueDetail> RevenueDetail;

}
