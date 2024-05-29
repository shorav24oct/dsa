package com.gfg.Searching;

public class SquareRoot {

	public static void main(String[] args) {
		int no = 16;
		System.out.println("Square root of " + no + " is " + sqRootEfficient(no));
	}

	/*
	 * θ(√no)
	 */
	private static int sqRoot(int no) {
		int i = 1;

		while (i * i <= no)
			i++;

		return (i - 1);
	}

	private static int sqRootEfficient(int no) {
		int low = 0;
		int high = no;
		int ans = 0;

		while (low <= high) {
			int mid = (low + high) / 2;
			int midSq = mid * mid;

			if (midSq == no)
				return mid;
			else if (midSq > no)
				high = mid - 1;
			else {
				low = mid + 1;
				ans = mid;
			}
		}
		return ans;
	}

}
