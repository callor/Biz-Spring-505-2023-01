package com.callor.contact.models;

public class Contact {
	
	/**
	 * 클래스 영역(맴버 영역)에 설정된 변수들
	 * 이 변수들을 "인스턴스변수"라고 한다
	 * 인스턴스변수는 클래스를 사용하여 객체를 선언하고
	 * 생성자(new) 를 사용하여 초기화되어 객체가 
	 * 인스턴스 화 할때 변수도 함께 사용할 준비가 된다.
	 * 
	 * Contact myContact = new Contact() 코드가 실행될때
	 * Contact 클래스에 선언된 변수들이 사용할 준비가 된다
	 * 		(인스턴스변수 초기화)
	 * 
	 * 인스턴스
	 * 객체지향에서 선언된 클래스를 사용하여 객체를 생성하고
	 * 초기화 하여 사용할 준비가 된 변수
	 * Class obj = new Class() 라는 코드가 있을때
	 * Class : 미리 선언된 클래스(prototype)
	 * obj : 객체, object, 객체변수 등으로 부른다
	 * obj = new Class() 코드가 실행되면
	 * 비로소 obj 객체는 인스턴스 화 된다
	 * 사용할 준비가 된 객체
	 * 
	 */
	private String c_id;
	private String c_name;
	private String c_tel;
	private String c_addr;
	private String c_hobby;
	private String c_email;
	private int c_age = 30;
	
	/**
	 * 생성자(생성자 method)
	 * 클래스를 사용하여 객체를 선언하고
	 * 객체를 초기화(인스턴스화) 할때 사용(호출)하는 method
	 * 
	 * 모든 클래스는 클래스를 선언하면 자동으로
	 * 기본 생성자가 만들어진다. 다만 코드로 보이지 않을 뿐이다
	 * 기본 생성자는 매개변수가 없고
	 * 		인스턴스 변수들을 기본값으로 초기화 하는 코드가
	 * 		내부적으로 작성되어 있다
	 * 
	 * 만약 개발자가 일부 인스턴스 변수를 특별한 값으로
	 * 초기화 하고 싶어서 매개변수가 있는 생성자를 만들면
	 * 기본 생성자는 disable 된다
	 * 즉, 기본 생성자는 사용할수 없다.
	 * 
	 * 매개변수가 있는 생성자를 임의 생성자 라고 하고
	 * 임의 생성자를 만들때는 기본생성자도 만들어 주는 것이
	 * 좋다
	 * 
	 * 그래야만이 기본생성자를 사용하는 코드에서
	 * 오류가 발생하지 않는다
	 * 
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(String c_id, String c_name, int c_age) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_age = c_age;
	}
	
	public int getC_age() {
		return c_age;
	}
	public void setC_age(int c_age) {
		this.c_age = c_age;
	}
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_tel() {
		return c_tel;
	}
	public void setC_tel(String c_tel) {
		this.c_tel = c_tel;
	}
	public String getC_addr() {
		return c_addr;
	}
	public void setC_addr(String c_addr) {
		this.c_addr = c_addr;
	}
	public String getC_hobby() {
		return c_hobby;
	}
	public void setC_hobby(String c_hobby) {
		this.c_hobby = c_hobby;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	@Override
	public String toString() {
		return "Contact [c_id=" + c_id + ", c_name=" + c_name + ", c_tel=" + c_tel + ", c_addr=" + c_addr + ", c_hobby="
				+ c_hobby + ", c_email=" + c_email + ", c_age=" + c_age + "]";
	}
	

}
