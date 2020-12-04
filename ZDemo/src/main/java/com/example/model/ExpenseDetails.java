package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
// done //
public class ExpenseDetails {
	@Id
	private Integer expenseDetailsId;
	private Integer expenseTypeId;
	private Date expenseDate;
	private Integer expenseAmount;
	private String expenseDescription;
	private Integer courseId;
	private Integer batchId;
	private Integer paymentModeId;
	private String chequeNumber;
	private Integer segemntTypeId;
	private Integer organizationId;
	private String receiptNumber;

	@ManyToOne
	private ExpenseType ExpenseTypes;

	@ManyToOne
	private Course Course;

	@ManyToOne
	private BatchDetails BatchDetails;

	@ManyToOne
	private PaymentMode PaymentMode;

	@ManyToOne
	private SegmentType SegmentType;

	@ManyToOne
	private Organization Organizations;

}
