package com.callor.contact.service;

import java.util.List;

import com.callor.contact.models.BookDto;

public interface BookService {
	
	public List<BookDto> selectAll();
	public BookDto findByIsbn(String isbn);
	public int insert(BookDto bookDto);
	public int update(BookDto bookDto);
	public int delete(String isbn);

}



