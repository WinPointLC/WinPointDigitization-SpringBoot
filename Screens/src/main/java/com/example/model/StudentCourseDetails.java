package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentCourseDetails {
	@Id
	private Integer studentCourseDetailsId;
	private Integer batchId;
	private Integer userId;
}
