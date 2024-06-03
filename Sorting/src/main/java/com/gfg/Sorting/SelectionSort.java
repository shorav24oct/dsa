package com.gfg.Sorting;

import java.util.Arrays;

/*
 * find the minimum element from unsorted part and putting it at the beginning.
 * The algorithm maintains two subarrays in a given array.
 * The subarray which is already sorted. 
 * Remaining subarray which is unsorted.
 * Time Complexity: O(n*n), where n is the number of elements in the input array.
 * Space Complexity: O(1)
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 10, 8, 6 };
		System.out.println("Array before Sort : " + Arrays.toString(arr));
		sort(arr, arr.length);
		System.out.println("Array after Sort : " + Arrays.toString(arr));
	}

	private static void sort(int[] arr, int length) {
		for (int i = 0; i < length - 1; i++) {
			int min_ind = i;
			for (int j = i + 1; j < length; j++)
				if (arr[j] < arr[min_ind])
					min_ind = j;
			swap(arr, i, min_ind);
		}
	}

	private static void swap(int[] arr, int i, int min_ind) {
		int temp = arr[min_ind];
		arr[min_ind] = arr[i];
		arr[i] = temp;
	}

}
