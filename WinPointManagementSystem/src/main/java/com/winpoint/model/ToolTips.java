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

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class ToolTips {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="toolTipId", updatable=false)	
	private Integer toolTipId;
	private String toolTipDescription;
	private Integer createdBy;
	private Date createdDate;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseTypeId", nullable = false)
	private Course mappingCourseType;

}
