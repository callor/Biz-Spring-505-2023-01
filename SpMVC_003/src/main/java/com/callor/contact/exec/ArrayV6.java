package com.callor.contact.exec;

public class ArrayV6 {

	public static void main(String[] args) {
		// String nation = new String("Korea");
		String nation = "Korea";
		String[] nations = nation.split("");
		for(String n : nations) {
			System.out.printf("%s\t",n);
		}
		
		// 분해된 문자열이 담긴 nations 배열의
		// 각 알파벳을 무작위로 Shuffle 해 보자
		for(int i = 0 ; i < nations.length ; i++) {
			int index1 = (int)(Math.random() * nations.length);
			int index2 = (int)(Math.random() * nations.length);
		}
		
		
	}
	
}
