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

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Lecture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lectureId", updatable = false)
	private Integer lectureId;
	private Integer lectureNumber;
	private Integer lectureDuration;
	private Date startTime;
	private String lectureCoverage;
	private Date lectureDate;
	private String comments;
	private String absentees;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "batchId", nullable = false)
//	@JsonManagedReference
	private BatchDetails mappingBatchDetails;

}
