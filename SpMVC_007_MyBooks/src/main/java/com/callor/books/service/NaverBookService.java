package com.callor.books.service;

import java.util.List;

import com.callor.books.models.BookDto;

public interface NaverBookService {
	
	// 검색어(search)를 사용하여 Naver 에 요청하는 query 문자열 생성
	public String queryURL(String search);
	// 요청하는 query 문자열을 사용하여 도서정보들을 조회하기
	public List<BookDto> getNaverBooks(String queryURL);
	// 요청하는 query 문자열을 사용하여 도서정보 를 조회하기
	public BookDto getNaverBook(String queryRUL);

}
