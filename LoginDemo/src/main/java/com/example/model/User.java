package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer userID;
	private String username;
	private String password;
}
