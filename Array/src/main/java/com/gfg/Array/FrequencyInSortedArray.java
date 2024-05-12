package com.gfg.Array;

public class FrequencyInSortedArray {

	public static void main(String[] args) {
		int[] arr = { 10, 10, 10, 20, 20, 30, 30, 40 };
		freqInArray(arr, arr.length);
	}

	private static void freqInArray(int[] arr, int length) {
		int freq = 1, i = 1;

		while (i < length) {
			while (i < length && arr[i] == arr[i - 1]) {
				freq++;
				i++;
			}
			System.out.println(arr[i - 1] + " " + freq);
			i++;
			freq = 1;
		}
		if (length == 1 || arr[length - 1] != arr[length - 2])
			System.out.println(arr[i - 1] + " " + 1);
	}

}
