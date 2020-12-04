package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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

//	@OneToMany(targetEntity = BatchDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "facultyUserId", referencedColumnName = "facultyId")
//	private List<BatchDetails> BatchDetails;
//
//	/////////////
//
	@ManyToOne
	private UserProfile UserProfile;

}
