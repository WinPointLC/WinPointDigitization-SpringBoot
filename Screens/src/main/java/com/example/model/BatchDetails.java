package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

//checked
//one error
@Entity
@Data
public class BatchDetails {
//	checked
	@Id
	private Integer batchId;
	private Integer courseId;
//	private Integer facultyUserId;
//	private Date beginDate;
//	private Date endDate;
//	private Integer createdBy;
//	private Date createdDate;
	private String batchName;
//	private Integer batchTime;
//	private Integer currentLectureNumber;
//	private String lectureDuration; 
//	private Integer totalNumberOfLectures;//
//	private Integer segmentTypeId;//

}
