package com.gfg.Array;

import java.util.Arrays;

public class PushZero {

	public static void main(String[] args) {
		int[] arr = {1, 2, 0, 0, 0, 3, 6};
		
		System.out.println(Arrays.toString(arr));
		
		test(arr, arr.length);
	}

	static void test(int[] arr, int n) {
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		
		while(count < n) {
			arr[count] = 0;
			count++;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
