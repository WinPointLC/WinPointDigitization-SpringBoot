package com.winpoint.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@Column(columnDefinition = "datetime")
	private Date startTime;
	private String lectureCoverage;
	@Column(columnDefinition = "datetime")
	private Date lectureDate;
	private String comments;
	private String absentees;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "batchId", nullable = false)
	private BatchDetails mappingBatchDetails;
	
	
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "absenteesTable", joinColumns = @JoinColumn(name = "lectureId"), inverseJoinColumns = @JoinColumn(name = "userId"))
	private List<UserProfile> mappingAbsentUsersList = new ArrayList<UserProfile>();
	
	
}
