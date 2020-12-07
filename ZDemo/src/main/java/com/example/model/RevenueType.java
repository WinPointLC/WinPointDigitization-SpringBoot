package com.example.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class RevenueType {
//	checked
	@Id
	private Integer revenueTypeId;
	private String revenueTypeName;

	
	@OneToMany(targetEntity = RevenueDetail.class)
	@JoinColumn(name = "revenueTypeId", referencedColumnName = "revenueTypeId")
	private Set<RevenueDetail> RevenueDetail;
	
	
//////////////////////
}
