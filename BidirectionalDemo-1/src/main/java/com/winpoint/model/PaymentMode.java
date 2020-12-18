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
public class PaymentMode {
//	Chekced
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="paymentModeId", updatable=false)
	private Integer paymentModeId;
	private String paymentModeName;
	
//	@OneToMany(targetEntity = ExpenseDetails.class)
//	@JoinColumn(name = "paymentModeId", referencedColumnName = "paymentModeId")
//	private Set<ExpenseDetails> mappingExpenseDetails;
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingPaymentMode")
	private Set<ExpenseDetails> mappingExpenseDetails;
	
//	@OneToMany(targetEntity = RevenueDetail.class)
//	@JoinColumn(name = "paymentModeId", referencedColumnName = "paymentModeId")
//	private Set<RevenueDetail> mappingRevenueDetail;
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingPaymentMode")
	private Set<RevenueDetail> mappingRevenueDetail;	
	//////////////////
	
}
