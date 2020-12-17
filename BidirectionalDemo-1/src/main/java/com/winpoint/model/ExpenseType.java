package com.winpoint.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class ExpenseType {
//	checked
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="expenseTypeId", updatable=false)
	private Integer expenseTypeId;
	private String expenseTypeName;
	
	
	
//	@OneToMany(targetEntity = ExpenseDetails.class)
//	@JoinColumn(name = "expenseTypeId", referencedColumnName = "expenseTypeId")
//	private Set<ExpenseDetails> ExpenseDetails;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingExpenseType")
	private Set<StudentCourseDetails> StudentCourseDetails;
	
	///////////////////

}
