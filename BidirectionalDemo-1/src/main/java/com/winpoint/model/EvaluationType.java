package com.winpoint.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class EvaluationType {
//	checked//
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="evaluationTypeId", updatable=false)
	private Integer evaluationTypeId;
	private String evaluationTypeName;
	private String offlineCheck;
	private Integer createdBy;
	private Date createdDate;

	
//	
//	@OneToMany(targetEntity = Course.class)
//	@JoinColumn(name = "evaluationTypeId", referencedColumnName = "evaluationTypeId")
//	private Set<Course> mappingCourse;
	
	
//	@OneToMany(targetEntity = TestDetails.class)
//	@JoinColumn(name = "evaluationTypeId", referencedColumnName = "evaluationTypeId")
//	private Set<TestDetails> mappingTestDetails;	
	
/////////////////////////////////
	
}
