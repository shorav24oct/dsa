package com.gfg.Array;

public class LargestNumber {

	/*
	 * naive approach Time Complexity Big-O(n*n)
	 */
	public static int largestNoNaive(int[] arr) {
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

	/*
	 * efficient solution time complexity Big-O(n)
	 */
	public static int largestNoEfficient(int[] arr) {
		int res = 0;

		for (int i = 1; i < arr.length; i++)
			if (arr[i] > arr[res])
				res = i;

		return res;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 20, 8 };

		System.out.println(largestNoNaive(arr));
	}

}
