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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators .PropertyGenerator.class, property="mappingCourse")
public class CoursePlans implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "coursePlansId", updatable = false)
	private Integer coursePlansId;
	private Integer lectureNumber;

//	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;
	
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingCoursePlan")
	List<Topics> mappingLecutreTopicPlan = new ArrayList<>();


	@Override
	public String toString() {
		return "CoursePlans [coursePlansId=" + coursePlansId + "]";
	}

	
	
	
}


