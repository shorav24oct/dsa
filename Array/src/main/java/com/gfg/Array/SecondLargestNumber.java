package com.gfg.Array;

public class SecondLargestNumber {

	/*
	 * Naive Approach
	 */
	static int secondLargest(int[] arr) {
		int largest = firstLargest(arr);
		int res = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[largest]) {
				if (res == -1)
					res = i;
				else if (arr[i] > arr[res])
					res = i;
			}
		}
		return res;
	}

	static int firstLargest(int[] arr) {
		int res = 0;
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > arr[res])
				res = i;
		return res;
	}

	/*
	 * Better Approach
	 */
	static int secondLarge(int[] arr) {
		int largest = 0;
		int res = -1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[largest]) {
				res = largest;
				largest = i;
			} else if (arr[i] != arr[largest]) {
				if (res == -1 || arr[i] > arr[res])
					res = i;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 200 };
		System.out.println(secondLarge(arr));
	}
}
