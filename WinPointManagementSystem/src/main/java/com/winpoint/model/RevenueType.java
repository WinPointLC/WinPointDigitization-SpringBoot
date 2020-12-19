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

import lombok.Data;

@Entity
@Data
public class RevenueType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "revenueTypeId", updatable = false)
	private Integer revenueTypeId;
	private String revenueTypeName;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingRevenueType")
	private Set<RevenueDetail> mappingRevenueDetail;

}
