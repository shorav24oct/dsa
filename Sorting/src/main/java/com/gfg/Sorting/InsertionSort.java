package com.gfg.Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 10, 8, 6 };
		System.out.println("Array before Sort : " + Arrays.toString(arr));
		sort(arr, arr.length);
		System.out.println("Array after Sort : " + Arrays.toString(arr));
	}

	private static void sort(int[] arr, int length) {
		for (int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

}
