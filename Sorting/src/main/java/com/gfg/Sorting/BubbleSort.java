package com.gfg.Sorting;

import java.util.Arrays;

/*
 * Time Complexity: O(n^2), where n is the number of elements in the input array.
 * Space Complexity: O(1)
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 5, 10, 8, 6 };
		System.out.println("Array before Sort : " + Arrays.toString(arr));
		sort(arr, arr.length);
		System.out.println("Array after Sort : " + Arrays.toString(arr));
	}

	private static void sort(int[] arr, int length) {
		for (int i = 0; i < length - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j);
					swapped = true;
				}
			}
			if (swapped == false)
				break;
		}
	}

	private static void swap(int[] arr, int j) {
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
	}
}
