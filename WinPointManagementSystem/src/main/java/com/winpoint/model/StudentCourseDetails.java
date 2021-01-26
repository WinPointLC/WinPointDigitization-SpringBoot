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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
// @JsonIdentityInfo(generator = ObjectIdGenerators .PropertyGenerator.class, property="courseName")
@JsonIdentityInfo(generator = ObjectIdGenerators .PropertyGenerator.class, property="mappingBatchDetails")
public class StudentCourseDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studentCourseDetailsId", updatable = false)
	private Integer studentCourseDetailsId;
	private String courseName;
	private String logoLocation;
	private String courseTypeName;
	private String streamName;
	private String feedbackGiven;
	private String certificateGiven;
	private Integer courseAggr;
	private String feeStatus;
	private Integer createdBy;
	@Column(columnDefinition = "datetime")
	private Date createdDate;
	private String coursewareIssued;
	private String assignmentsIssued;
	private String assignmentsSubmitted;
	private Integer feeReminderCount;
	private Integer studentCount;
	private Integer dueAmount;
	private Integer percentageAttendance;

	//batch_id - done 
	//
	//expense_type_id - done 
	//grade_id - done
	//reminder_type_id 
	//
	//stream_id

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "reminderTypeId", nullable = true)
	private ReminderType mappingReminderType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gradeId", nullable = true)
	private GradingSystem mappingGradingSystem;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "batchId", nullable = true)
	private BatchDetails mappingBatchDetails;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;

//	@Column(nullable = true)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "expenseTypeId", nullable = true)
	private ExpenseType mappingExpenseType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
	private UserProfile mappingUserProfile;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "streamId", nullable = true)
	private Streams mappingStreams;

	

}
