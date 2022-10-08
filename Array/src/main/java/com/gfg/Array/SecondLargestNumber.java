package com.gfg.Array;

public class SecondLargestNumber {

	static int secondLargest(int[] arr) {
		int largest = firstLargest(arr);
		int res = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[largest]) {
				if(res == -1)
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

	public static void main(String[] args) {
		int[] arr = { 5000, 8, 10, 7, 2000 };

		System.out.println(secondLargest(arr));
	}
}
