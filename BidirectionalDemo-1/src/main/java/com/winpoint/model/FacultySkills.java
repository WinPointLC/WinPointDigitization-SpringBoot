package com.winpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class FacultySkills {
//	checked

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="facultySkillsId", updatable=false)
	private Integer facultySkillsId;
	private Integer facultyUserId;
	private String skillSetId;
	private Integer createdBy;
	private Date createdDate;
	private String segmentTypeId;
	private String timeSlotsId;

	
	
	//doubt 
//
//	/////////////
//
	

}
