package com.gfg.Array.operations;

public class SearchUnsorted {

	public static void main(String[] args) {
		int arr[] = { 20, 5, 7, 25 };
		int result = search(arr, arr.length, 25);
		if (result == -1)
			System.out.println("Element is not present in Array");
		else
			System.out.println("Element is present at index => " + result);
	}

	// linear search
	// time complexity O(n)
	private static int search(int[] arr, int n, int x) {
		for (int i = 0; i < n; i++)
			if (arr[i] == x)
				return i;

		return -1;
	}

}
