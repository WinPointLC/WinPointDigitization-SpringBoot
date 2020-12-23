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
	private SegmentType mappingSegmentType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paymentModeId", nullable = false)
	private PaymentMode mappingPaymentMode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "batchId", nullable = false)
	private BatchDetails mappingBatchDetails;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organizationId", nullable = false)
	private Organization mappingOrganization;

//	private Integer segmentTypeId = mappingSegmentType.getSegmentTypeId();
//	private Integer paymentModeId = mappingPaymentMode.getPaymentModeId();
//	private Integer batchId = mappingBatchDetails.getBatchId();
//	private Integer courseId = mappingCourse.getCourseId();
//	private Integer organizationId = mappingOrganization.getOrganizationId();

}
