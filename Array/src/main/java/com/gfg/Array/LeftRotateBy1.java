package com.gfg.Array;

import java.util.Arrays;

public class LeftRotateBy1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Array before rotate: " + Arrays.toString(arr));
		leftRotate(arr, arr.length);
	}

	private static void leftRotate(int[] arr, int n) {
		int temp = arr[0];

		for (int i = 1; i < n; i++)
			arr[i - 1] = arr[i];
		arr[n - 1] = temp;

		System.out.println("Array after rotate: " + Arrays.toString(arr));
	}

}
