package com.winpoint.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingSegmentType")
	private Set<BatchDetails> mappingBatchDetails;	

	
//	@OneToMany(targetEntity = EnquiryDetails.class)
//	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
//	private Set<EnquiryDetails> mappingEnquiryDetails;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingSegmentType")
	private Set<EnquiryDetails> mappingEnquiryDetails;	

	
//	@OneToMany(targetEntity = ExpenseDetails.class)
//	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
//	private Set<ExpenseDetails> mappingExpenseDetails;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingSegmentType")
	private Set<ExpenseDetails> mappingExpenseDetails;	

	
//	@OneToMany(targetEntity = RevenueDetail.class)
//	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
//	private Set<RevenueDetail> mappingRevenueDetail;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingSegmentType")
	private Set<RevenueDetail> mappingRevenueDetail;	

	
//	@OneToMany(targetEntity = UserProfile.class)
//	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
//	private Set<UserProfile> mappingUserProfile;

	/////////////
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingSegmentType")
	private Set<UserProfile> mappingUserProfile;
}
