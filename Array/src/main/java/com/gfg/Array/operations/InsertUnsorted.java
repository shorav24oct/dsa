package com.gfg.Array.operations;

import java.util.Arrays;

public class InsertUnsorted {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 7, 20, 0 };

		System.out.println("Before Insert : " + Arrays.toString(arr));

		System.out.println("After insert array size => " + insert(arr, 4, 3, 5, 2));

		System.out.println("After Insert : " + Arrays.toString(arr));
	}

	// time complexity O(n)
	// insert at the END O(1)
	// insert at the beginning θ(n)
	private static int insert(int[] arr, int n, int noToBeInsert, int capacity, int position) {

		if (n == capacity)
			return n;

		int index = position - 1;

		for (int i = n - 1; i >= index; i--)
			arr[i + 1] = arr[i];

		arr[index] = noToBeInsert;

		return (n + 1);
	}

}
