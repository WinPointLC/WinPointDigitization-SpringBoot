package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Author;
import com.example.model.Book;
import com.example.repository.AuthorRepository;
import com.example.repository.BooksRepository;

@Controller
public class SampleController {
	
	@Autowired
	BooksRepository bookRepo;
	@Autowired
	AuthorRepository authRepo;

	@RequestMapping(value = "/sample")
	void trialForMulti() {
		Author auth = new Author();
		auth.setAuthor_name("JK");
		Book book = new Book();
		book.setBook_name("HP1");
		auth.getBooks().add(book);
		book.getAuthors().add(auth);
		bookRepo.save(book);
//		authRepo.save(auth);
		

		System.out.println("Hello");

	}
}
