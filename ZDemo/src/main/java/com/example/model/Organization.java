package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Organization {
//	checked
	@Id
	private Integer organizationId;
	private String organizationName;
	private String organizationType;
	


//	@OneToMany(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "organizationId", referencedColumnName = "organizationId")
//	private List<ExpenseDetails> ExpenseDetails;
//	
//	
//	
//	@OneToMany(targetEntity = RevenueDetail.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "organizationId", referencedColumnName = "organizationId")
//	private List<RevenueDetail> RevenueDetail;

	////////////////////
}
