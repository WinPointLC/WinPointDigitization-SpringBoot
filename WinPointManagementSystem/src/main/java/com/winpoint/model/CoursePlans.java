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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Getter
@Setter
public class CoursePlans implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "coursePlansId", updatable = false)
	private Integer coursePlansId;
	private Integer lectureNumber;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;
	
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCoursePlan")
	List<Topics> mappingLecutreTopicPlan = new ArrayList<>();

}
