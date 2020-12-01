package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class UserDetails {
	@Id
	private Integer userId;
	private String firstName;
	private String lastName;
	private String email;
	private String college;
	private String mobileNumber;
	private String cousesAlreadyDone;

}
