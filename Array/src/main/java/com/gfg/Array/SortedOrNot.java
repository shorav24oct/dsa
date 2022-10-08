package com.gfg.Array;

public class SortedOrNot {

	/*
	 * naive approach 
	 * time complexity Big-O(n*n)
	 */
	static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[i])
					return false;

		return true;
	}

	/*
	 * efficient approach
	 * time complexity Big-O(n)
	 */
	static boolean isSort(int[] arr) {
		for (int i = 1; i < arr.length; i++)
			if (arr[i] < arr[i - 1])
				return false;

		return true;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 80, 10, 70, 2000 };

		System.out.println(isSort(arr));
	}

}
