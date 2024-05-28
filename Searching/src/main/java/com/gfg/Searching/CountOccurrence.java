package com.gfg.Searching;

public class CountOccurrence {

	public static void main(String[] args) {
		int[] arr = { 5, 10, 10, 15, 15, 15 };
		int no = 10;
		System.out.println(no + " occurr " + count(arr, no) + " times");
	}

	private static int count(int[] arr, int no) {
		int first = FirstOccurrence.search(arr, no);
		if (first == -1)
			return 0;
		else
			return (LastOccurrence.search(arr, no) - first + 1);
	}

}
