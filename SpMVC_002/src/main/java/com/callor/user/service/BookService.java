package com.callor.user.service;

import org.springframework.stereotype.Service;

import com.callor.user.models.BookVO;

/**
 * Controller 와 DB 중간에서
 * Business Login 을 처리하는 모듈
 */
@Service
public class BookService {

	public BookVO getBook() {
		
		BookVO book = new BookVO();
		book.setIsbn("9700001");
		book.setTitle("NodeJS 교과서");
		book.setComp("길벗");
		book.setAuthor("조현영");
		book.setPrice(30000);
		return book;
		
	}
	
	
}
