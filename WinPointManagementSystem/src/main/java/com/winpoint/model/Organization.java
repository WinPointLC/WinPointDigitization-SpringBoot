package com.winpoint.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Organization {
//	checked
	@Id
	private Integer organizationId;
	private String organizationName;
	private String organizationType;
	


//	@OneToMany(targetEntity = ExpenseDetails.class)
	@JoinColumn(name = "organizationId", referencedColumnName = "organizationId")
	private Set<ExpenseDetails> ExpenseDetails;
	
	
	
//	@OneToMany(targetEntity = RevenueDetail.class)
	@JoinColumn(name = "organizationId", referencedColumnName = "organizationId")
	private Set<RevenueDetail> RevenueDetail;

	////////////////////
}
