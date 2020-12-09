package com.example.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class SegmentType {
//	checked
	@Id
	private Integer segmentTypeId;
	private String segmentTypeName;

//	
	@OneToMany(targetEntity = BatchDetails.class)
	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
	private Set<BatchDetails> mappingBatchDetails;
//	
//	
//	
	@OneToMany(targetEntity = EnquiryDetails.class)
	@JoinColumn(name = "segementTypeId", referencedColumnName = "segmentTypeId")
	private Set<EnquiryDetails> mappingEnquiryDetails;
//	
//	
//	
	@OneToMany(targetEntity = ExpenseDetails.class)
	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
	private Set<ExpenseDetails> mappingExpenseDetails;
//	
//	
	@OneToMany(targetEntity = RevenueDetail.class)
	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
	private Set<RevenueDetail> mappingRevenueDetail;
	
	
	
	@OneToMany(targetEntity = UserProfile.class)
	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
	private Set<UserProfile> mappingUserProfile;
	
	/////////////


}
