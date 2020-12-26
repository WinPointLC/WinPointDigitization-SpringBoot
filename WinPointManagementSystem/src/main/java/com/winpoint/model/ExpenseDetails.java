package com.winpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ExpenseDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "expenseDetailsId", updatable = false)
	private Integer expenseDetailsId;
	private Integer expenseTypeId;
	private Date expenseDate;
	private Integer expenseAmount;
	private String expenseDescription;;
	private String chequeNumber;
	private String receiptNumber;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "segmentTypeId", nullable = false)
//	@JsonManagedReference
	private SegmentType mappingSegmentType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paymentModeId", nullable = false)
//	@JsonManagedReference
	private PaymentMode mappingPaymentMode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "batchId", nullable = false)
//	@JsonManagedReference
	private BatchDetails mappingBatchDetails;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", nullable = false)
//	@JsonManagedReference
	private Course mappingCourse;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organizationId", nullable = false)
//	@JsonManagedReference
	private Organization mappingOrganization;

}
