package com.winpoint.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class ReminderType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reminderTypeId", updatable = false)
	private Integer reminderTypeId;
	private String reminderTypeCategory;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingReminderType")
	private Set<StudentCourseDetails> mappingStudentCourseDetails;

}
