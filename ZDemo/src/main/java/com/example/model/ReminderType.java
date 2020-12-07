package com.example.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class ReminderType {
//	checked
	@Id
	private Integer reminderTypeId;
	private String reminderTypeCategory;
	
	@OneToMany(targetEntity = StudentCourseDetails.class)
	@JoinColumn(name = "reminderTypeId", referencedColumnName = "reminderTypeId")
	private Set<StudentCourseDetails> StudentCourseDetails;
}
