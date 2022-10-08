package com.gfg.Mathematical;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPal(124));
	}

	private static boolean isPal(int no) {

		int temp = no;
		int result = 0;
		int rem = 0;

		while (no != 0) {
			rem = no % 10;
			result = result * 10 + rem;
			no = no / 10;
		}

		return (temp == result);
	}

}
