package com.callor.books.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
	
	private String title;//	String	책 제목
	private String 	link;//	String	네이버 도서 정보 URL
	private String image;//	String	섬네일 이미지의 URL
	private String author;//	String	저자 이름
	private String discount;//	Integer	판매 가격. 절판 등의 이유로 가격이 없으면 값을 반환하지 않습니다.
	private String publisher;//	String	출판사
	private String isbn;//	Integer	ISBN
	private String description;//	String	네이버 도서의 책 소개
	private String pubdate;//

}
