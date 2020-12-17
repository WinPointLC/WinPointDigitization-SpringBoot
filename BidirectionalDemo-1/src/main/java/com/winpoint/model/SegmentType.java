package com.winpoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class SegmentType {
//	checked
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="segmentTypeId", updatable=false)	
	private Integer segmentTypeId;
	private String segmentTypeName;

//	@OneToMany(targetEntity = BatchDetails.class)
//	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
//	private Set<BatchDetails> mappingBatchDetails;
//
//	@OneToMany(targetEntity = EnquiryDetails.class)
//	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
//	private Set<EnquiryDetails> mappingEnquiryDetails;
//
//	@OneToMany(targetEntity = ExpenseDetails.class)
//	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
//	private Set<ExpenseDetails> mappingExpenseDetails;
//
//	@OneToMany(targetEntity = RevenueDetail.class)
//	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
//	private Set<RevenueDetail> mappingRevenueDetail;
//
//	@OneToMany(targetEntity = UserProfile.class)
//	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
//	private Set<UserProfile> mappingUserProfile;

	/////////////
}
