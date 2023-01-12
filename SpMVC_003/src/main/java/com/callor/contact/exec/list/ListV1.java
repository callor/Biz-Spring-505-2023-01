package com.callor.contact.exec.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListV1 {
	
	public static void main(String[] args) {
		/**
		 * ArrayList<Type> 
		 * 1. 기본 배열의 단점을 보완하는 JDK 에서 제공하는
		 * 		확장된 배열 이것을 List 라고 한다
		 * 2. 초기에 배열의 크기를 지정하지 않고 생성한다
		 * 3. 필요에 따라 요소들을 add 하거나 remove 할수 있다
		 * 4. 다양한 보조 도구를 사용할수 있다
		 * 
		 * nums1, nums2, nums3, nums4 는
		 * List type 객체(Object)
		 * 		Java Object 는 dot(.) 연산자를 통하여
		 * 		다양한 준비된 기능을 사용할수 있다
		 * List type 의 객체를 만들어서 사용하려면
		 * 		반드시 관련 Class 가 import 되어야 한다
		 * 		이 type 은 Java 에서 기본으로 제공하는 것이 아니다
		 * 		JDK 에 포함된 사용자 (필요에따라) import하여
		 * 		사용하는 도구들이다
		 */
		ArrayList<Integer> nums1 = new ArrayList();
		LinkedList<Integer> nums2 = new LinkedList<Integer>();
		Vector<Integer> nums3 = new Vector();
		Stack<Integer> nums4 = new Stack();
		
		// List 에 요소가 몇개 있느냐?
		int size = nums1.size();
		System.out.println(size);
		
		// nums1 List 에 정수 100 한개를 요소로 추가
		nums1.add(100);
		System.out.println(nums1.size());
		
		// 0번 요소의 값을 읽어서(getter) result 변수에 저장
		int result = nums1.get(0);

		// nums1 List 의 0번 요소를 제거하라
		// 요소가 제거되면 List 의 개수가 줄어든다
		// 여러개의 요소가 있을때 요소 index 를 기준으로
		// 제거가 가능하다
		nums1.remove(0);
		System.out.println(nums1.size());

	}

}
