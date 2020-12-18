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

import lombok.Data;

@Entity
@Data
public class StudentCourseDetails {
//	checked
//	fk
//	comp fk
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="studentCourseDetailsId", updatable=false)	
	private Integer studentCourseDetailsId;
//	private Integer courseId;// composite pk
//	private Integer batchId;
	private String courseName;
	private String logoLocation;
	private String courseTypeName;
	private String streamName;
	private String feedbackGiven;
	private String certificateGiven;
	private Integer courseAggr;
	private String gradeId;//
	private String feeStatus;
	private Integer createdBy;
	private Date createdDate;
	private String coursewareIssued;
	private String assignmentsIssued;
	private String assignmentsSubmitted;
	private Integer reminderTypeId;//
	private Integer feeReminderCount;
	private Integer studentCount;
	private Integer dueAmount;
	private Integer percentageAttendance;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "batchId", nullable = false)
	private BatchDetails mappingBatchDetails;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "expenseTypeId", nullable = false)
	private ExpenseType mappingExpenseType;

	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false)
	private UserProfile mappingUserProfile;

}
