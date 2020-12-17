package com.winpoint.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class RevenueDetail {
//	checked
//	fk
	@Id
	private String revenueDetailId;
	private Integer revenueTypeId;
	private String receiptNumber;
	private String payerDescription;
	private Integer courseId;
	private Integer batchId;
	private String revenueAmount;
	private Integer paymentModeId;
	private String chequeNumber;
	private Integer segmentTypeId;
	private Integer organizationId;
	private Integer userId;
	private String receiveDate;



}
