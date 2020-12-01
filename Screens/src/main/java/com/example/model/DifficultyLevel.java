package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class DifficultyLevel {
	@Id
	private Integer difficultyLevelId;
	private String difficultyLevelName;

}
