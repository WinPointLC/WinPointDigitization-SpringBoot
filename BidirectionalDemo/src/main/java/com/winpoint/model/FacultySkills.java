package com.winpoint.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class FacultySkills {
//	checked

	@Id
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
