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
public class Organization {
//	checked
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="organizationId", updatable=false)
	private Integer organizationId;
	private String organizationName;
	private String organizationType;
	


//	@OneToMany(targetEntity = ExpenseDetails.class)
//	@JoinColumn(name = "organizationId", referencedColumnName = "organizationId")
//	private Set<ExpenseDetails> ExpenseDetails;
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingOrganization")
	private Set<ExpenseDetails> ExpenseDetails;	
	
//	@OneToMany(targetEntity = RevenueDetail.class)
//	@JoinColumn(name = "organizationId", referencedColumnName = "organizationId")
//	private Set<RevenueDetail> RevenueDetail;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingOrganization")
	private Set<RevenueDetail> RevenueDetail;	
	
	////////////////////
}
