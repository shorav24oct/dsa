package com.gfg.strings;

public class PalindromeCheck {

	public static void main(String[] args) {
		String str = "a";

		System.out.println("String reversed or not? : " + isPalindrome(str));
	}

	/*
	 * naive solution
	 */
	static boolean isPalindrome(String str) {

		StringBuilder stringBuilder = new StringBuilder(str);

		stringBuilder.reverse();

		return str.equals(stringBuilder.toString());
	}

	/*
	 * efficient approach
	 * time complexity Big-O(n)
	 * space complexity Big-O(1)
	 */
	static boolean isPal(String str) {
		int begin = 0;
		int end = str.length() - 1;

		while (begin < end) {
			if (str.charAt(begin) != str.charAt(end))
				return false;
			begin++;
			end--;
		}
		return true;
	}

}
