package com.gfg.Array;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		int arr[] = { 5, 7, 3, 20, 1 };
		System.out.println("Before Delete =>" + Arrays.toString(arr));
		deleteAnElement(arr, arr.length, 3);
	}

	private static int deleteAnElement(int[] arr, int length, int noToBeDelete) {
		
		int i = 0;
		
		for (i = 0; i < length; i++)
			if (arr[i] == noToBeDelete)
				break;
		
		

		return -1;
	}

}
