package com.callor.contact.exec;

public class ExecV4 {

	// static void main() method 에서
	// nation() method 를 호출하고 있다
	// 이때 호출하는 main() method 에
	// static keyword 가 있으므로
	// 호출받는 nation() method 에도 
	// 반드시 static 이 있어야 한다.
	// 
	public static void nation() {
		System.out.println("대한민국");
	}

	/**
	 * @param num1
	 * 정수형 매개변수(parameter, argument)를 갖는 method
	 * 이 method 를 호출하려면 반드시 정수값을 함께 전달해야한다
	 * 매개변수에 정수값을 주입해야 한다
	 */
	private static void num(int num1) {
		System.out.println(num1);
	}
	
	public static void main(String[] args) {
		nation();
		// num() method 를 호출하려면
		// 반드시 정수값을 주입해야 하고
		// 주입할 값이 없으면 0 이라도 주입해야 한다.
		// 생략할 수 없다.
		num(200);
		num(0);
		
		int num1 = 0;
		num1 = 100;
		num1 = 200;
		num1 = 0;

	}
	

}
