package com.example.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

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
	@OneToMany(targetEntity = Course.class)
	@JoinColumn(name = "evaluationTypeId", referencedColumnName = "evaluationTypeId")
	private Set<Course> Course;
	
	
	@OneToMany(targetEntity = TestDetails.class)
	@JoinColumn(name = "evaluationTypeId", referencedColumnName = "evaluationTypeId")
	private Set
	<TestDetails> TestDetails;	
	
/////////////////////////////////
	
}
