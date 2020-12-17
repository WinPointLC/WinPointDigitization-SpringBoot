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

import lombok.Data;

@Entity
@Data
// done //
public class ExpenseDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="expenseDetailsId", updatable=false)
	private Integer expenseDetailsId;
	private Integer expenseTypeId;
	private Date expenseDate;
	private Integer expenseAmount;
	private String expenseDescription;
//	private Integer courseId;
//	private Integer batchId;
	private Integer paymentModeId;
	private String chequeNumber;
	private Integer segemntTypeId;
	private Integer organizationId;
	private String receiptNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "batchId", nullable = false)
	private BatchDetails mappingBatchDetails;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseId", nullable = false)
	private Course mappingCourse;


}
