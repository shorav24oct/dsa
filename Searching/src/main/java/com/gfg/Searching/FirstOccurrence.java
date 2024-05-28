package com.gfg.Searching;

public class FirstOccurrence {

	public static void main(String[] args) {
		int[] arr = { 5, 10, 10, 15, 15, 15 };
		int numberToBeSearch = 15;
		System.out.println("Number " + numberToBeSearch + " is present at index: " + search(arr, numberToBeSearch));
	}

	private static int search(int[] arr, int numberToBeSearch) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] > numberToBeSearch)
				high = mid - 1;
			else if (arr[mid] < numberToBeSearch)
				low = mid + 1;
			else {
				if (mid == 0 || arr[mid - 1] != arr[mid])
					return mid;
				else
					high = mid - 1;
			}
		}

		return -1;
	}

}
