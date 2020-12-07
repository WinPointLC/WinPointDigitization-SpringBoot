package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class ToolTips {
//	checked
//	fk redo
	@Id
	private Integer toolTipId;
	private Integer courseTypeId;
	private String toolTipDescription;
	private Integer createdBy;
	private Date createdDate;
	
	
	
	
//	
//	

//	
	

}
