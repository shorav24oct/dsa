package com.gfg.Array;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 0, 0, 8, 0, 9, 0 };

		System.out.println(Arrays.toString(arr));

		moveZeroToEnd(arr, arr.length);
	}

	/*
	 * Naive Solution
	 */
	static void moveToEnd(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				for (int j = i + 1; j < n; j++) {
					if (arr[j] != 0) {
						swap(arr, i, j);
						break;
					}
				}

			}
		}
		System.out.println(Arrays.toString(arr));
	}

	/*
	 * Efficient Solution
	 */
	static void moveZeroToEnd(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				swap(arr, count, i);
				count++;
			}

		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int A[], int a, int b) {
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}

}
