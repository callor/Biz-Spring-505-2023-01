package com.callor.contact.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.callor.contact.models.Contact;
import com.callor.contact.service.ContactService;

@Service
public class ContactServiceImplV1 implements ContactService {

	/**
	 * 클래스 인스턴스변수 초기화 하기
	 * 인스턴스변수는 기본생성자에서 
	 * 보통 기본값으로 초기화가 된다. null 또는 0 으로
	 * 
	 * 기본값이 null 로 선언된 객체를 통하여
	 * 무언가 실행을 하려고 하면 Null Pointer Exception이
	 * 주로 발생한다
	 * 
	 * Null Pointer Exception 문제는 오래전부터 Java 개발자를
	 * 매우 괴롭혔다
	 * 
	 */
	// private Random rnd = new Random(); // 이렇게 하지 말고
	// 이렇게 선언만 하고, 아래 생성자에서 초기화
	private Random rnd; 
	
	// private String[] names = new String[]{
	//		"홍길동","이몽룡","성춘향","임꺽정","장보고"
	//};
	private String[] names;
	// 기본생성자에서 names 인스턴스 배열을
	// 5개의 이름이 담긴 문자열 배열로 만들기
	public ContactServiceImplV1() {
		this.names = new String[]{
			"홍길동","이몽룡","성춘향","임꺽정","장보고"
		};
		this.rnd = new Random(); // 생성자에서 초기화
	}

	@Override
	public List<Contact> selectAll() {
		List<Contact> contactList = new ArrayList<>();
		for(int i = 0 ; i < 10 ; i++) {

			Contact con = new Contact();
			String strId = String.format("S%03d", i+1);
			con.setC_id(strId);
			
			int num = rnd.nextInt(5);
			con.setC_name(names[num]);
			contactList.add(con);
		}
		return contactList;
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
		Contact myContact = new Contact(
				"S0001","홍길동",
				"callor@callor.com",33
				);
		System.out.println(myContact.toString());
		Contact myCA = new Contact("A001","이몽룡",20);
		Contact myCB = new Contact("F001","성춘향",16);
		
		// 기본생성자를 사용하여 모든 인스턴스변수를
		// 기본값(String = null, 숫자 =  0 등)으로 하는
		// 객체 생성 방법
		Contact myBlank = new Contact();
		myBlank.setC_name("장보고");
		myBlank.setC_id("B0001");
		
		return myContact;
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
