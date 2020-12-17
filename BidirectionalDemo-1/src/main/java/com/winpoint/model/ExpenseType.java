package com.winpoint.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class ExpenseType {
//	checked
	@Id
	private Integer expenseTypeId;
	private String expenseTypeName;
	
	
	
//	@OneToMany(targetEntity = ExpenseDetails.class)
//	@JoinColumn(name = "expenseTypeId", referencedColumnName = "expenseTypeId")
//	private Set<ExpenseDetails> ExpenseDetails;

	
	///////////////////

}
