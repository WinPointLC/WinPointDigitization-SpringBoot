package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ExpenseType {
//	checked
	@Id
	private Integer expenseTypeId;
	private String expenseTypeName;
	
	
	
//	@OneToMany(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "expenseTypeId", referencedColumnName = "expenseTypeId")
//	private List<ExpenseDetails> ExpenseDetails;

	
	///////////////////

}
