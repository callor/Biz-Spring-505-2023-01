package com.callor.books.service;

import java.util.List;

import com.callor.books.models.BookDto;
import com.callor.books.persistence.GenericDao;

public interface MyBookService extends GenericDao<BookDto, String> {
	
	public List<BookDto> findByTitle(String title);
	public List<BookDto> findByAuthor(String author);
	public List<BookDto> findByPublisher(String publisher);
	
}
