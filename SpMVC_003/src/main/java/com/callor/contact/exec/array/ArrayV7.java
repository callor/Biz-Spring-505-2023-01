package com.callor.contact.exec.array;

public class ArrayV7 {

	public static void main(String[] args) {

		/*
		 * 정수형 배열 45개를 만들고 index 0 ~ 44 까지 요소에 1 ~ 45까지의 정수를 저장
		 */
		int[] nums = new int[45];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		for (int n : nums) {
			System.out.printf("%d\t", n);
		}

		System.out.printf("\n%d\n", nums[44]);

		/*
		 * 배열 45개의 요소를 Shuffle 하고 결과를 출력
		 */
		// for(int i = nums.length ; i > 0 ; i--) {}
		for (int i = 0; i < 1000; i++) {
			int index1 = (int) (Math.random() * nums.length);
			int index2 = (int) (Math.random() * nums.length);

			// 숫자형 변수 2개의 값 교환하기
			if (index1 != index2) {
				System.out.printf("%d, %d\t", nums[index1], nums[index2]);
				nums[index1] = nums[index1] + nums[index2];
				System.out.printf("%d, %d\t", nums[index1], nums[index2]);
				nums[index2] = nums[index1] - nums[index2];
				System.out.printf("%d, %d\t", nums[index1], nums[index2]);
				nums[index1] = nums[index1] - nums[index2];
				System.out.printf("%d, %d \n", nums[index1], nums[index2]);
			}

//			int _n = nums[index1];
//			nums[index1] = nums[index2];
//			nums[index2] = _n;
		}
		System.out.println();
		for(int n : nums) {
			System.out.printf("%d\t",n);
		}
		System.out.println();

		int[] lottos = new int[6];
		// nums 배열의 0 부터 5까지 요소를
		// lottos 0 부터 5까지 요소에 각각 복사
		for (int i = 0; i < 6; i++) {
			lottos[i] = nums[i];
		}

		System.out.println();
		for (int n : lottos) {
			System.out.printf("%d\t", n);
		}

		/*
		 * lottos 배열에 저장된 각 값들을 오름차순 정렬하여 출력하기
		 */
		for (int i = 0; i < lottos.length; i++) {

			for (int j = i + 1; j < lottos.length; j++) {
				if (lottos[i] > lottos[j]) {
					int _n = lottos[i];
					lottos[i] = lottos[j];
					lottos[j] = _n;
				}
			}
		}
		System.out.println();
		for (int n : lottos) {
			System.out.printf("%d\t", n);
		}

	}
}
