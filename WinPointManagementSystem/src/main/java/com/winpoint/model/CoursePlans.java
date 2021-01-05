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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CoursePlans{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "coursePlansId", updatable = false)
	private Integer coursePlansId;
	private Integer lectureNumber;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCoursePlans")
	List<Topics> mappingLecutrePlan = new ArrayList<>();

}
