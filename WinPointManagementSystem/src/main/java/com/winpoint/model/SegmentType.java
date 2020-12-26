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

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SegmentType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "segmentTypeId", updatable = false)
	private Integer segmentTypeId;
	private String segmentTypeName;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingSegmentType")
	@JsonBackReference
	private Set<BatchDetails> mappingBatchDetails;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingSegmentType")
	@JsonBackReference
	private Set<EnquiryDetails> mappingEnquiryDetails;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingSegmentType")
	@JsonBackReference
	private Set<ExpenseDetails> mappingExpenseDetails;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingSegmentType")
	@JsonBackReference
	private Set<RevenueDetail> mappingRevenueDetail;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mappingSegmentType")
	@JsonBackReference
	private Set<UserProfile> mappingUserProfile;
}
