package com.gfg.Array.operations;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		int arr[] = { 5, 7, 3, 20, 1 };
		System.out.println("Before Delete =>" + Arrays.toString(arr));
		System.out.println(deleteAnElement(arr, arr.length, 3));
		System.out.println("After Delete =>" + Arrays.toString(arr));
	}

	private static int deleteAnElement(int[] arr, int length, int noToBeDelete) {

		int i = 0;

		for (i = 0; i < length; i++)
			if (arr[i] == noToBeDelete)
				break;

		if (i == length)
			return length;

		for (int j = i; j < length - 1; j++)
			arr[j] = arr[j + 1];

		return (length - 1);
	}

}
