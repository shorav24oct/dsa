package com.gfg.strings;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		String s = "I love Java";
		System.out.println("Before => " + s);
		char[] ans = reverseWords(s.toCharArray(), s.length());
		System.out.println("After => " + new String(ans));
	}

	private static char[] reverseWords(char[] str, int length) {
		int start = 0;

		for (int end = 0; end < length; end++) {
			if (str[end] == ' ') {
				reverse(str, start, end - 1);
				start = end + 1;
			}
		}

		reverse(str, start, length - 1); // only reverse last word of String
		reverse(str, 0, length - 1); // reverse the entire String
		return str;
	}

	private static void reverse(char[] str, int low, int high) {

		while (low <= high) {
			swap(str, low, high);
			low++;
			high--;
		}
	}

	private static void swap(char[] str, int low, int high) {
		char temp;
		temp = str[low];
		str[low] = str[high];
		str[high] = temp;
	}

}
