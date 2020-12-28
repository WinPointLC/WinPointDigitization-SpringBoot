package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class books_authors {
	@Id
	private Integer bookAuthorsId;
	private Integer author_id;
	private Integer book_id;
}
