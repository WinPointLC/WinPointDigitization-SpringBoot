package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class SegmentType {
//	checked
	@Id
	private Integer segmentTypeId;
	private String segmentTypeName;

	
//	@OneToMany(targetEntity = BatchDetails.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
//	private List<BatchDetails> BatchDetails;
//	
//	
//	
//	@OneToMany(targetEntity = EnquiryDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "segementTypeId", referencedColumnName = "segementTypeId")
//	private List<EnquiryDetails> EnquiryDetails;
//	
//	
//	
//	@OneToMany(targetEntity = ExpenseDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "segemntTypeId", referencedColumnName = "segemntTypeId")
//	private List<ExpenseDetails> ExpenseDetails;
//	
//	
//	@OneToMany(targetEntity = RevenueDetail.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
//	private List<RevenueDetail> RevenueDetail;
//	
//	
//	
//	@OneToMany(targetEntity = UserProfile.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "segmentTypeId", referencedColumnName = "segmentTypeId")
//	private List<UserProfile> UserProfile;
	
	/////////////


}
