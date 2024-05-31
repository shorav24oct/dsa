package com.gfg.Sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 5, 10, 8, 6 };
		System.out.println("Array before Sort : " + Arrays.toString(arr));
		sort(arr, arr.length);
	}

	private static void sort(int[] arr, int length) {
		for (int i = 0; i < length - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr[j], arr[j + 1]);
					swapped = true;
				}
			}
		}
	}

	private static void swap(int i, int j) {
		
	}
}
