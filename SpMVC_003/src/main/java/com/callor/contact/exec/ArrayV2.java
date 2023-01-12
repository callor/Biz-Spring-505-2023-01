package com.callor.contact.exec;

public class ArrayV2 {
	
	public static void main(String[] args) {
		int[] nums1 = new int[10];
		// 배열 자체를 println() 으로 console 출력을 하면
		// 배열 요소의 0번째 위치의 실제 기억장소
		// 주소를 알수 있다.
		System.out.println(nums1);
		
		// nums2 라는 변수에는 실제 배열데이터가 저장된
		// 기억공간의 첫번째 주소(index 0번)가 저장되어 있다
		// println() 배열의 첫번째 요소 주소가 확인된다
		int[] nums2 = new int[20];
		System.out.println(nums2);
		
		/**
		 * 배열.length(length 속성) : 배열의 개수, 길이를
		 * 알려주는 속성이다
		 */
		System.out.println(nums1.length);
		
		/**
		 * nums1 이라는 배열 전체의 모든 요소에
		 * 정수 10을 저장하고 싶다
		 */
		for(int index = 0 ; index < 10 ; index++) {
			nums1[index] = 10;
		}
		// 배열의 개수를 일일이 확인하지 않아도
		// 전체 배열에 정수 10을 저장할수 있다
		for(int index = 0 ; index < nums1.length ; index++) {
			nums1[index] = 10;
		}
		
		/**
		 * 어떤 코드를 사용할때 일반적인 숫자표현식(숫자 리터럴)을
		 * 사용하는 것은 지양(자제) 해야 한다
		 * 일반적인 숫자를 사용하면 항상 변화되는 숫자를
		 * 개발자가 알고있어야 하고, 숫자를 잘못 지정하여
		 * 오류가 발생하는 확률이 높아진다
		 * 숫자 값을 직접 사용하지 않아도 어떤 속을 참조하여
		 * 알수 있으면 그러한 방법을 사용해야 한다
		 * 
		 * 매직넘버링 : 숫자를 직접 사용하는 것
		 * 코딩을 할때 매직넘버링은 잠재적인 오류를 발생할 확률이
		 * 매우 높은 방법이다
		 * 가능하면 사용하지 말라
		 */
		
		
		
	}

}
