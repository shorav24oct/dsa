package com.gfg.Searching;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int numberToBeSearch = 50;
		System.out.println("Number " + numberToBeSearch + " is present at index: " + search(arr, numberToBeSearch));
	}

	private static int search(int[] arr, int numberToBeSearch) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == numberToBeSearch)
				return mid;
			else if (arr[mid] > numberToBeSearch)
				high = mid - 1;
			else
				low = mid + 1;
		}

		return -1;
	}
}
