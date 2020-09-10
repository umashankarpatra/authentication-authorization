package com.uma.boo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uma.boo.pojo.Book;

@RestController
public class NewBookController {
	private Logger logger = LoggerFactory.getLogger(NewBookController.class);

	private static List<Book> books;

	static {
		books = Book.of();
	}

	@GetMapping("/newBooks")
	public List<Book> getNewBook() {
		logger.info("{} Method :: getNewBook  , Class ::  NewBookController");
		return books;

	}
}
