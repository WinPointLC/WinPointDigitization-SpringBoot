package com.winpoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class RevenueDetail {
//	checked
//	fk
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="revenueDetailId", updatable=false)
	private Integer revenueDetailId;
	private Integer revenueTypeId;
	private String receiptNumber;
	private String payerDescription;
//	private Integer courseId;
//	private Integer batchId;
	private String revenueAmount;
//	private Integer paymentModeId;
	private String chequeNumber;
	private Integer segmentTypeId;
//	private Integer organizationId;
	private String receiveDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paymentModeId", nullable = false)
	private PaymentMode mappingPaymentMode; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organizationId", nullable = false)
	private Organization mappingOrganization; 

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "batchId", nullable = false)
	private BatchDetails mappingBatchDetails;


	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false)
	private UserProfile mappingUserProfile;
	
}
