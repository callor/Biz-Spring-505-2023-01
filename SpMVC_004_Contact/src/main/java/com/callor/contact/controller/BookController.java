package com.callor.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.callor.contact.dao.BookDao;
import com.callor.contact.models.Book;

@RestController
@RequestMapping(value="/book")
public class BookController {
	
	@Autowired
	private BookDao bookDao;
	
	@RequestMapping(value={"/",""})
	public List<Book> list() {
		return bookDao.selectAll();
	}

}
