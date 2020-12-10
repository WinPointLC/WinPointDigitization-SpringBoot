package com.winpoint.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class OrganizationType {
//	checked
	@Id
	@GeneratedValue
	private Integer organizationTypeId;
	private String organizationTypeName;
	

}
