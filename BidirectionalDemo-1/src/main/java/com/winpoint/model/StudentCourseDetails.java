package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentCourseDetails {
//	checked
//	fk
//	comp fk
	@Id
	private Integer studentCourseDetailsId;
	private Integer userId;//
	private Integer courseId;// composite pk
	private Integer batchId;//
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

}
