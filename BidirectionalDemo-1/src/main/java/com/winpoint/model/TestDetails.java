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
public class TestDetails {
//	checked
//	redo fk
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="testDetailId", updatable=false)	
	private Integer testDetailId;
	private Integer courseId;//
	private Integer testNumber;
	private Integer totalQuestions;
	private String rules;
	private String testFees;
	private String negativeMarking;
	private Integer evaluationTypeId;
	private Integer createdBy;
	private Date createdDate;
	
	
//	@OneToMany(targetEntity = UserTestDetails.class)
//	@JoinColumn(name = "testDetailId", referencedColumnName = "testDetailId")
//	private Set<UserTestDetails> UserTestDetails;
	

}
