package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class RevenueDetail {
//	checked
//	fk
	@Id
	private String revenueDetailId;
	private String revenueTypeId;
	private String receiptNumber;
	private String payerDescription;
	private String courseId;
	private String batchId;
	private String revenueAmount;
	private String paymentModeId;
	private String chequeNumber;
	private String segmentTypeId;
	private String organizationId;
	private String userId;
	private String receiveDate;

	@ManyToOne
	private RevenueType RevenueType;

	@ManyToOne
	private Course Course;

	@ManyToOne
	private BatchDetails BatchDetails;

	@ManyToOne
	private PaymentMode PaymentMode;

	@ManyToOne
	private SegmentType SegmentType;

	@ManyToOne
	private Organization Organization;

	@ManyToOne
	private UserProfile UserProfile;

}
