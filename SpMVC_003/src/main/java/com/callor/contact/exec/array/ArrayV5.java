package com.callor.contact.exec.array;

public class ArrayV5 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random() * 100) + 1;
		}
		
		// 전체 합산
		int sum = 0 ;
		for(int num : nums) {
			sum += num;
			System.out.printf("%d\t",num);
		}
		System.out.printf("\n%d\n",sum);
		
		sum = 0;
		for(int num : nums) {
			if(num % 2 == 0) {
				System.out.printf("%d\t",num);
				sum += num;
			}
		}
		System.out.printf("\n짝수합 : %d\n",sum);
	}
}
