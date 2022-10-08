package com.gfg.Array;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		int[] arr = { 5, 80, 10, 70, 2000 };
		System.out.println(Arrays.toString(arr));
		reverse(arr);
	}

	/*
	 * time complexity Theta-n
	 */
	private static void reverse(int[] arr) {
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			int temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			low++;
			high--;
		}

		System.out.println(Arrays.toString(arr));
	}

}
