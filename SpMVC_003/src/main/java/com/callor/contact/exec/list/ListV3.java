package com.callor.contact.exec.list;

import java.util.ArrayList;

public class ListV3 {
	
	public static void main(String[] args) {
		
		/**
		 * Generic type : <> 둘러쌓인 type
		 * List<Generictype> : 
		 * 	List 객체에 add 할수 있는
		 * 	data type 을 강제 지정하기
		 * 
		 *  Generic type 이외의 데이터를 add() 하면
		 *  코드에 오류가 표현된다
		 *  개발자로 하여금 잘못된 데이터를 add() 하여
		 *  이후에 발생할수 있는 문제를
		 *  사전에 방지할수 있도록 알려준다
		 * 
		 * Generic type 에는 클래스 type 만 사용할수 있다
		 * 
		 * primitive(기본형) type 은 사용할 수 없다
		 * 	int, long, float, double, boolean, char, byte
		 * 	primitive type 은 모두가 첫글자 소문자
		 *  이 단어는 모두 keyword, 예약어
		 */
		// ArrayList<int> nums2 = new ArrayList<int>();
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		nums1.add(30);
		
		/*
		 * keyword, 예약어(resolved word)
		 * 	java 언어가 탄생될때, 미리 만들어진 "명령어" 들
		 * 	이러한 단어는 절대 변수명, 함수명, 클래스명 등으로
		 * 	사용할수 없다
		 * 	또한 용도를 변경할수도 없다
		 */
//		int for = 100;
//		int public = 20;
//		int class = 30;
//		int int = 100;
//		boolean if = true;
		
		/**
		 * 정수형 Generic type 을 갖는 List 를 하나 만들고 싶다
		 * 그런데 Generic type 에는 primitive keyword 를
		 * 		사용할수 없단다
		 * 그럼 어떻게 정수형 Generic type 을 갖는 List 를
		 * 		만들어야 할까
		 * 
		 * 이러한 이유로 변수를 선언하는 class 를 제공해 준다
		 * 변수를 선언하는 class 는
		 * primitive(기본) keyword 와 같거나 유사하며 
		 * 		첫글자가 대문자이다
		 * 기본형 변수에 여러가 추가된 확장기능을 첨가하여
		 * 만들어진 클래스이다
		 * 
		 * 변수를 선언하는 클래스 = wrapper class 라고 한다
		 * 기본 변수 선언 키워드와 거의 유사한 성질을 가지며
		 * 추가된 확장 기능을 포함하고 있다.
		 * 
		 */
		int num1 = 0;
		Integer num11 = 0;
		
		long num3 = 0l;
		Long num33 = 0L;
		
		float num2 = 0.0f;
		Float num22 = 0.0F;
		
		double num4 = 0.0;
		Double num44 = 0.0;
		
		boolean bYes1 = true;
		Boolean bYes11 = true;
		
	}

}
