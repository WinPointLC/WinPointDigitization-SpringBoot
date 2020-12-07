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
	private Set<BatchDetails> BatchDetails;
//	
//	
//	
	@OneToMany(targetEntity = EnquiryDetails.class)
	@JoinColumn(name = "segementTypeId", referencedColumnName = "segmentTypeId")
	private Set<EnquiryDetails> EnquiryDetails;
//	
//	
//	
	@OneToMany(targetEntity = ExpenseDetails.class)
	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
	private Set<ExpenseDetails> ExpenseDetails;
//	
//	
	@OneToMany(targetEntity = RevenueDetail.class)
	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
	private Set<RevenueDetail> RevenueDetail;
	
	
	
	@OneToMany(targetEntity = UserProfile.class)
	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
	private Set<UserProfile> UserProfile;
	
	/////////////


}
