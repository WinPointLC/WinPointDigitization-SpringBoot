package com.winpoint.model;

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

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CoursePlans {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "coursePlansId", updatable = false)
	private Integer coursePlansId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;
	
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "coursePlanLectureTable", joinColumns = @JoinColumn(name = "coursePlansId"), inverseJoinColumns = @JoinColumn(name = "LecutreId"))
	private List<Lecture> mappingLectures = new ArrayList<Lecture>();
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "coursePlanTopicTable", joinColumns = @JoinColumn(name = "coursePlansId"), inverseJoinColumns = @JoinColumn(name = "TopicId"))
	private List<Topics> mappingLecutrePlan = new ArrayList<Topics>();

}
