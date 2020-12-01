package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Topics {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer topicId;
	private Integer courseId;
	private String TopicName;
}
