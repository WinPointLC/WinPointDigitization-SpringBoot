package com.winpoint.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class PaymentMode {
//	Chekced
	@Id
	private Integer paymentModeId;
	private String paymentModeName;
	
	@OneToMany(targetEntity = ExpenseDetails.class)
	@JoinColumn(name = "paymentModeId", referencedColumnName = "paymentModeId")
	private Set<ExpenseDetails> ExpenseDetails;
	
	
	
	@OneToMany(targetEntity = RevenueDetail.class)
	@JoinColumn(name = "paymentModeId", referencedColumnName = "paymentModeId")
	private Set<RevenueDetail> RevenueDetail;
	
	
	//////////////////
	
}
