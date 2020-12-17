package com.winpoint.model;

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
public class RevenueType {
//	checked
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="revenueTypeId", updatable=false)
	private Integer revenueTypeId;
	private String revenueTypeName;

	
//	@OneToMany(targetEntity = RevenueDetail.class)
//	@JoinColumn(name = "revenueTypeId", referencedColumnName = "revenueTypeId")
//	private Set<RevenueDetail> mappingRevenueDetail;
	
	
//////////////////////
}
