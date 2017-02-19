package com.algorithm.basics;

import java.util.Random;
import java.util.stream.IntStream;

public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		bubbleSortEx1(nums,true);
		bubbleSortEx1(generateRandonArrayInt(100),false);
		bubbleSortEx1(generateRandonArrayInt(1000),false);
		bubbleSortEx1(generateRandonArrayInt(10000),false); // "ORDO" O(N*N)  N = 10 000
		bubbleSortEx1(generateRandonArrayInt(20000),false); // "ORDO" O(N*N)  N = 10 000		2 -> 2*2 = 4
		bubbleSortEx1(generateRandonArrayInt(30000),false); // "ORDO" O(N*N)  N = 10 000		3 -> 3*3 = 9
	}

	private static int[] generateRandonArrayInt(int number) {
		Random random = new Random();
		int[] nums = new int[number];
		for (int i = 0; i < number; i++){
			nums[i] = random.nextInt(100);
		}
		return nums;
	}

	private static void bubbleSortEx1(int[] nums, Boolean print) {
//		O(N*N) quadratic running time
//		for i=0 to N
		long start = System.currentTimeMillis();
		System.out.println("Example BubbleSortEx1 ");
		System.out.println("Array Size :" + nums.length);
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < (nums.length - i); j++) {
				if (nums[j - 1] > nums[j]) {
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Algorithm takes time to finish: " + (end - start) + "ms");
		if(print){
			IntStream.range(0, nums.length).forEach(i -> System.out.print(nums[i] + " - "));
		}
		System.out.println("\n");
	}

}