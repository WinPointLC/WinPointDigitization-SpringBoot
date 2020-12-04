package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class TestDetails {
//	checked
//	redo fk
	@Id
	private Integer testDetailId;
	private String courseId;//
	private Integer testNumber;
	private Integer totalQuestions;
	private String rules;
	private String testFees;
	private String negativeMarking;
	private Integer evaluationTypeId;
	private Integer createdBy;
	private Date createdDate;
	
	
	
//	@OneToMany(targetEntity = TestDifficulty.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "testDetailId", referencedColumnName = "testDetailId")
//	private List<TestDifficulty> TestDifficulty;
//	
//	
//	@OneToMany(targetEntity = UserTestDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "testDetailsId", referencedColumnName = "testDetailsId")
//	private List<UserTestDetails> UserTestDetails;
//
//	
//	
//	
//	///////////////////////////
//
	@ManyToOne
	private Course Course;

//	

	@ManyToOne
	private EvaluationType EvaluationType;

}
