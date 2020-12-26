package com.winpoint.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Organization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "organizationId", updatable = false)
	private Integer organizationId;
	private String organizationName;
	private String organizationType;

//	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingOrganization")
	private Set<ExpenseDetails> ExpenseDetails;

//	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingOrganization")
	private Set<RevenueDetail> RevenueDetail;

}