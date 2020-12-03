package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ReminderType {
//	checked
	@Id
	private Integer reminderTypeId;
	private String reminderTypeCategory;
	
}
