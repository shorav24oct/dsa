package com.gfg.Sorting;

import java.util.Arrays;

/*
 * find the minimum element from unsorted part and putting it at the beginning.
 * The algorithm maintains two sub-arrays in a given array.
 * The sub-array which is already sorted. 
 * Remaining sub-array which is unsorted.
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

	/*
	 * Initialize minimum value(min_idx) to location 0
	 * Traverse the array to find the minimum element in the array
	 * While traversing if any element smaller than min_idx is found then swap both the values.
	 * Then, increment min_idx to point to next element
	 * Repeat until array is sorted
	 */
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
