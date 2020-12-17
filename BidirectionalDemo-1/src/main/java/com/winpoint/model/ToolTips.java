package com.winpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class ToolTips {
//	checked
//	fk redo
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="toolTipId", updatable=false)	
	private Integer toolTipId;
	private Integer courseTypeId;
	private String toolTipDescription;
	private Integer createdBy;
	private Date createdDate;
	
}
