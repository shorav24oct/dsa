package com.gfg.strings;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		String str = "ind sa";

		System.out.println("Before : " + str);

		char[] result = reverseWord(str.toCharArray(), str.length());
		System.out.println("After : " + new String(result));
	}

	private static char[] reverseWord(char[] str, int length) {
		int start = 0;
		int end = 0;

		for (end = 0; end < length; end++) {
			if (str[end] == ' ') {
				reverse(str, start, end - 1);
				start = end + 1;
			}
		}

		reverse(str, start, length - 1); // reverse only last word of string
		reverse(str, 0, length - 1); // reverse the whole string

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
		char temp = str[low];
		str[low] = str[high];
		str[high] = temp;
	}

}
