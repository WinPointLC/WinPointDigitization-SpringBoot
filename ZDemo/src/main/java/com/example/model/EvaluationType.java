package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EvaluationType {
//	checked//
	@Id
	private Integer evaluationTypeId;
	private String evaluationTypeName;
	private String offlineCheck;
	private Integer createdBy;
	private Date createdDate;

	
//	
//	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "evaluationTypeId", referencedColumnName = "evaluationTypeId")
//	private List<Course> Course;
//	
//	
//	@OneToMany(targetEntity = TestDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "evaluationTypeId", referencedColumnName = "evaluationTypeId")
//	private List<TestDetails> TestDetails;	
	
/////////////////////////////////
	
}
