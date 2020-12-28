package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;


@Entity
@Data
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int author_id;
	private String author_name;

	@ManyToMany(mappedBy = "authors")
	private List<Book> books = new ArrayList<>();

 }
