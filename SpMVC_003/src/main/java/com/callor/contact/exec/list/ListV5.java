package com.callor.contact.exec.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListV5 {
	
	public static void main(String[] args) {
		/**
		 * 
		 * List type 의 객체는
		 * ArrayList, LinkedList 를 사용하여 만들수 있다
		 * 이 두가지 클래스는 
		 * List 라는 부모 인터페이스를 impl 하여
		 * 작성되어 있다
		 * 그래서 List type 의 객체를 만들때는
		 * 선언문은 List interface type 으로 하고
		 * 생성은 ArrayList 또는 LinkedList 로 한다 
		 */
		List<Integer> nums = new LinkedList<Integer>();// new ArrayList<Integer>();
		
		/**
		 * 빈(blank) nums 의 항상 끝에 새로은 데이터 추가하기
		 * nums.add(데이터)
		 */
		for(int i = 0 ; i < 5 ; i++) {
			int rndNum = (int)(Math.random() * 100) + 1;
			nums.add(rndNum);
		}
		System.out.println(nums);

		/**
		 * add 할 위치를 지정하기
		 * nums.add(3, 데이터)
		 * 
		 * 원래 5개의 list 요소중에 3번 요소가 뒤로 밀리면서
		 * 3번 요소에 공백이 생기고
		 * 그 위치에 데이터가 추가된다
		 */
		for(int i = 0 ; i < 5 ; i++) {
			int rndNum = (int)(Math.random() * 100) + 1;
			nums.add(3,rndNum);
		}
		System.out.println(nums);

		
		
		
	}

	
	
}
