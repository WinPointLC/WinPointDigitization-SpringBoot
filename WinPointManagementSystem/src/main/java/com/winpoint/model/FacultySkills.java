package com.winpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FacultySkills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "facultySkillsId", updatable = false)
	private Integer facultySkillsId;
	private String skillSetId;
	private Integer createdBy;
	private Date createdDate;
	private String segmentTypeId;
	private String timeSlotsId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
//	@JsonManagedReference
	private UserProfile mappingUserProfile;

}
