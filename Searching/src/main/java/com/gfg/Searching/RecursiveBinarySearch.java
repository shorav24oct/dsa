package com.gfg.Searching;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int numberToBeSearch = 40;
		System.out.println("Number " + numberToBeSearch + " is present at index: " + search(arr, numberToBeSearch, 0, arr.length - 1));
	}

	static int search(int[] arr, int no, int low, int high) {

		if (low > high)
			return -1;

		int mid = (low + high) / 2;

		if (arr[mid] == no)
			return mid;
		else if (arr[mid] > no)
			return search(arr, no, low, mid -1);
		else
			return search(arr, no, low + 1, high);

	}

}
