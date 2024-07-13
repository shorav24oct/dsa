package com.citi.array;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr = { 10, 5, 8 };

		System.out.println(secondLargest(arr));

	}

	static int secondLargest(int[] arr) {
		int largest = 0;
		int res = -1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[largest]) {
				res = largest;
				largest = i;
			} else if (arr[i] != arr[largest]) {
				if (res == -1 || arr[i] > arr[res]) {
					res = i;
				}
			}
		}

		return res;

	}

}
