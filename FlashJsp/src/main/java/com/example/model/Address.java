package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Address {

	@Id
	private Integer addressId;
	private String city;
	private Integer pinCode;
	private String country;
	
	
}
