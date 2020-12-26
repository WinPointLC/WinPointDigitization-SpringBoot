package com.winpoint.model;

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
public class RevenueDetail {
//	checked
//	fk
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "revenueDetailId", updatable = false)
	private Integer revenueDetailId;
	private String receiptNumber;
	private String payerDescription;
	private String revenueAmount;
	private String chequeNumber;
	private String receiveDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "segmentTypeId", nullable = false)
	@JsonManagedReference
	private SegmentType mappingSegmentType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "revenueTypeId", nullable = false)
	@JsonManagedReference
	private RevenueType mappingRevenueType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paymentModeId", nullable = false)
	@JsonManagedReference
	private PaymentMode mappingPaymentMode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organizationId", nullable = false)
	@JsonManagedReference
	private Organization mappingOrganization;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "batchId", nullable = false)
	@JsonManagedReference
	private BatchDetails mappingBatchDetails;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", nullable = false)
	@JsonManagedReference
	private Course mappingCourse;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
	@JsonManagedReference
	private UserProfile mappingUserProfile;

}
