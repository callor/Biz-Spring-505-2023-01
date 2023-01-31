package com.callor.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.callor.contact.models.BookDto;
import com.callor.contact.service.BookService;

@RestController
@RequestMapping(value="/book")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value={"","/"})
	public List<BookDto> selectAll() {
		return bookService.selectAll();
	}
}


