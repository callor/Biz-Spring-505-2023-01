package com.callor.contact.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.contact.models.Contact;
import com.callor.contact.service.ContactService;

@Service
public class ContactServiceImplV1 implements ContactService {

	@Override
	public List<Contact> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact findById(String id) {

		/**
		 * Contact 클래스를 사용하여
		 * Contact 정보를 저장할 myContact 객체선언
		 * 생성자(new Contact()) 를 사용하여
		 * myContact 객체를 생성 => 인스턴스 화
		 * 
		 * 이때 Contact 에 선언된 변수들은 모두 초기화가
		 * 된다.
		 */
		Contact myContact = new Contact("S0001","홍길동",33);
		System.out.println(myContact.toString());
		Contact myCA = new Contact("A001","이몽룡",20);
		Contact myCB = new Contact("F001","성춘향",16);
		
		
		return null;
	}

	@Override
	public int insert(Contact contact) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Contact contact) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
