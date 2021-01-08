package com.winpoint.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators .PropertyGenerator.class, property="mappingBatchDetails")
public class Lecture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lectureId", updatable = false)
	private Integer lectureId;
	private Integer lectureNumber;
	private Integer lectureDuration;
	@Column(columnDefinition = "datetime")
	private Date startTime;
	@Column(columnDefinition = "datetime")
	private Date lectureDate;
	private String comments;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "batchId", nullable = false)
	private BatchDetails mappingBatchDetails;
	
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "absenteesTable", joinColumns = @JoinColumn(name = "lectureId"), inverseJoinColumns = @JoinColumn(name = "userId"))
	private Set<UserProfile> mappingAbsentUsersList = new HashSet<>();
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "topicsCoveredLecture", joinColumns = @JoinColumn(name = "lectureId"), inverseJoinColumns = @JoinColumn(name = "topicId"))
	private Set<Topics> mappingTopicsCovered = new HashSet<>();
	
	
	
}
