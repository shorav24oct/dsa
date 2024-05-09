package com.gfg.Array;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 30, 30, 30 };
		System.out.println("Before: " + Arrays.toString(arr) + " Size: " + arr.length);
		removeDup(arr);
	}

	/*
	 * Naive Solution Theta-n 
	 * Aux Space Theta-n
	 */
	static void removeDup(int[] arr) {
		int[] temp = new int[arr.length];

		temp[0] = arr[0];

		int res = 1;

		for (int i = 1; i < arr.length; i++) {
			if (temp[res-1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}
		}

		for (int i = 0; i < arr.length; i++)
			arr[i] = temp[i];
		
		System.out.println("After: " + Arrays.toString(arr) + " Size: " + res);

	}

}
