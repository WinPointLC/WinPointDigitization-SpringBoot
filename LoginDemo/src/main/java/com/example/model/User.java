package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue
	private Integer userID;
	private String username;
	private String password;
}
