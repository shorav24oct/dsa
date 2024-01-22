package com.gfg.Mathematical;

public class DigitsInNumber {

	public static void main(String[] args) {
		System.out.println(countDigits(123));
	}

	private static int countDigits(int no) {
		if (no == 0)
			return 1;

		int count = 0;

		while (no > 0) {
			no = no / 10;
			count++;
		}

		return count;
	}

}
