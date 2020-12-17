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
public class StudentTestResultJavascriptModular {
//		checked
//		fk
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="StudentTestResultJavascriptModularId", updatable=false)	
	private Integer StudentTestResultJavascriptModularId;
	private Integer userTestId;
	private Integer qNumber;
	private Integer questionId;
	private Character studentResponse;
	private String isCorrect;
	private Integer createdBy;
	private Date createdDate;

}
