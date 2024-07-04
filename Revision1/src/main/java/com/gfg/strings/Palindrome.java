package com.gfg.strings;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPal("madam"));
	}

	static boolean isPal(String text) {
		int low = 0;
		int high = text.length() - 1;

		while (low < high) {
			if (text.charAt(low) != text.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}

}
