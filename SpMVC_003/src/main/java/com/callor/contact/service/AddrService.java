package com.callor.contact.service;

import java.util.List;

import com.callor.contact.models.AddrVO;

/*
 * interface
 * Java Source Code 또다른 class
 * 모양만 있는 클래스
 * 
 * 1. 클래스를 만들기 위한 prototype 선언이다
 * 2. method 를 정의하고 모양(arg type, return type)을 구축한다
 * 3. 구체적인 method 의 코드가 없다. 코드블럭( {} ) 없다
 * 4. 클래스를 만들때 implements 하여 사용하는 부모 class 이다
 * 5. 이 클래를 객체로 만들때는 구현체 클래스가 있어야 한다
 */
public interface AddrService {
	
	public List<AddrVO> selectAll() ;
	public AddrVO findById(String num);
	
	public int insert(AddrVO addrVO);
	public int update(AddrVO addrVO);
	public int delete(String num);

}
