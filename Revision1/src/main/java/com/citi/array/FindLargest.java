package com.citi.array;

public class FindLargest {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 20, 80 };

		System.out.println(largestNaive(arr));
	}

	/*
	 * Naive using 2 for loop
	 */
	static int largestNaive(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			boolean flag = true;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					flag = false;
					break;
				}
			}

			if (flag == true)
				return i;
		}
		return -1;
	}

}
