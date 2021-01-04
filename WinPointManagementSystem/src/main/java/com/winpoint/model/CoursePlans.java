package com.winpoint.model;

import java.io.Serializable;
import java.util.ArrayList;
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
public class CoursePlans implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "coursePlansId", updatable = false)
	private Integer coursePlansId;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "coursePlanLectureTable", joinColumns = @JoinColumn(name = "coursePlansId"), inverseJoinColumns = @JoinColumn(name = "LecutreId"))
	private List<Lecture> mappingLectures = new ArrayList<Lecture>();
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "coursePlanTopicTable", joinColumns = @JoinColumn(name = "coursePlansId"), inverseJoinColumns = @JoinColumn(name = "TopicId"))
	private List<Topics> mappingLecutrePlan = new ArrayList<Topics>();

}
