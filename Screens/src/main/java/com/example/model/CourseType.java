package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CourseType {
	@Id
	private Integer courseTypeId;
	private String courseTypeName;
	private Integer streamId;

}
