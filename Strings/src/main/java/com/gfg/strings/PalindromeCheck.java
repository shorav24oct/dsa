package com.gfg.strings;

public class PalindromeCheck {

	public static void main(String[] args) {
		String str = "ana";

		System.out.println("String reversed or not? : " + isPalindrome(str));
	}

	static boolean isPalindrome(String str) {

		StringBuilder stringBuilder = new StringBuilder(str);

		stringBuilder.reverse();

		return str.equals(stringBuilder.toString());
	}

}
