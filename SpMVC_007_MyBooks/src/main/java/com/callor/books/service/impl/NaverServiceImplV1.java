package com.callor.books.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.callor.books.config.NaverSecret;
import com.callor.books.models.BookDto;
import com.callor.books.service.NaverBookService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class NaverServiceImplV1 implements NaverBookService{

	protected URI restURI;
	
	@Override
	public String queryURL(String search) {

		String encodeText = null;
		
		/**
		 * 네트워크를 통해서 데이터를 주고받거나
		 * 파일에 데이터를 저장, 읽기 하는 과정에서
		 * exception 이 매우 자주 발생하는 코드가 작성되면
		 * java 는 강제로 try...catch 를 사용하여 exception 처리를 하도록
		 * 강제한다.
		 * 이때는 exception 처리를 하지 않으면 코드가 실행되지 않는다
		 */
		try {
			encodeText = URLEncoder.encode(search,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			log.debug("Encoding Exception 처리");
		}
		
		// http://openapi.naver.com ... ?query=검색어 문자열 생성
		String queryURL = String.format("%2$s?query=%1$s", 
				encodeText, NaverSecret.NAVER_BOOK_URL_JSON);
		return queryURL;
	}

	@Override
	public List<BookDto> getNaverBooks(String queryURL) {
		RestTemplate restTemp = new RestTemplate();
		
		try {
			restURI = new URI(queryURL);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Naverr-Client-Id", NaverSecret.CLIENT_ID);
		headers.set("X-Naver-Client-Secret", NaverSecret.CLIENT_SECRET);
		
		return null;
	}

	@Override
	public BookDto getNaverBook(String queryRUL) {
		// TODO Auto-generated method stub
		return null;
	}

}



