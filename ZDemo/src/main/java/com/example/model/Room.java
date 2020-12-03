package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Room {
//	checked
	@Id
	private Integer roomId;
	private Integer roomCapacity;
	private Boolean roomAvailable;

}