package com.callor.contact.exec;

public class ExecV5 {

	/*
	 * 한 모듈(file, class) 단위에서
	 * 같은 이름의 변수, 같은 이름의 함수(method)는
	 * 중복하여 만들수 없다(중복선언 금지)
	 * 
	 * 자바는 완전한 객체지향 표준어이다
	 * 객체지향의 특징중에
	 * 		method의 매개변수의 상태에 따라
	 * 		method의 이름을 중복하여 선언할 수 있다
	 * 이것을 Overloading(method의 중복선언) 이라고 한다
	 * 
	 * 중복선언된 method 는 호출하는 곳에서
	 * 주입한 값의 상태에 따라 자동으로 알아서
	 * 정확한 method 가 호출된다.
	 * 
	 * method 영역이 다르면
	 * 같은 이름의 변수를 또 선언하여 사용할수 있다
	 */
	public static void num(int num1) {}
	public static void num(int num1, int num2) {}
	public static void num(float num1) {}
	public static void num(double num1) {}
	
	public static void main(String[] args) {
		num(100);
		num(100,200);
		num(100f);
		num(100.0);
		
		int num1 = 100;
		num1 = 200;
		// num1  변수는 이미 한번 선언되었기 때문에
		// 다시 선언 할수 없다.
		// int num1 = 200;
	}
	
}
