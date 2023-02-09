package com.callor.books.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.books.models.BookDto;
import com.callor.books.persistence.BookDao;
import com.callor.books.service.MyBookService;


@Service
public class MyBookServiceImplV1 implements MyBookService{
	
	protected final BookDao bookDao;
	public MyBookServiceImplV1(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<BookDto> selectAll() {
		return bookDao.selectAll();
	}

	@Override
	public BookDto findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BookDto vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BookDto vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BookDto> findByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> findByPublisher(String publisher) {
		// TODO Auto-generated method stub
		return null;
	}

}
