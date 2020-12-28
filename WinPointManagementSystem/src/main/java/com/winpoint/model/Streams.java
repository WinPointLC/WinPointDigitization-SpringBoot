package com.winpoint.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Streams {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "streamId", updatable = false)
	private Integer streamId;
	private String streamName;
	private Integer createdBy;
	private Date createdDate;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingStreams")
	private Set<StreamCourseType> mappingStreamCourseType;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingStreams")
	private Set<Course> mappingCourse;

}