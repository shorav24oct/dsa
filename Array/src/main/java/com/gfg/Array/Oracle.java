package com.gfg.Array;

public class Oracle {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 12, 13, 17 };
		int x = 18;
		System.out.println(test(arr, x));
	}

	static boolean test(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			if (arr[low] + arr[high] == x)
				return true;
			if (arr[low] + arr[high] > x)
				high--;
			if (arr[low] + arr[high] < x)
				low++;
		} //while
		return false;
	}// test()

}// class
