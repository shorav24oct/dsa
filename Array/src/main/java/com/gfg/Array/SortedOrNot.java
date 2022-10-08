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
	
	

	public static void main(String[] args) {
		int[] arr = { 5, 8, 10, 70, 2000 };

		System.out.println(isSorted(arr));
	}

}
