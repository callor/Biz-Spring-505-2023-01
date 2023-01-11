package com.callor.contact.exec;

public class ExecV6 {
	
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10 ; i ++) {
			System.out.println(i);
		}
		
		int num0 = (int)Math.random();
		int num1 = (int)(Math.random() * 10) + 1;
		
		for(int i = 0 ;  i < 10 ; i++) {
			int num2 = (int)(Math.random() * 10) + 1;
//			System.out.println(num2);
			
			// num2 변수에 값을 2로 나눈 나머지가 0인가 비교하여
			// 결과를 even 변수에 할당
			// 나머지가 0이면 true, 아니면 false 가 담긴다
			boolean even = num2 % 2 == 0;
			// if(even == true)
			if(even) {
				System.out.println(num2 + "의 값은 짝수");
			} else {
				System.out.println(num2 + "의 값은 짝수가 아님");
			}
		}
		
		
	}

}
