package com.gfg.strings;

import java.util.Arrays;

public class Anagram {
	/*
	 * time complexity Big-O(n log n)
	 */
	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;

		char[] s1 = str1.toCharArray();
		Arrays.sort(s1);
		str1 = new String(s1);

		char[] s2 = str2.toCharArray();
		Arrays.sort(s2);
		str2 = new String(s2);

		return str1.equals(str2);
	}

	/*
	 * efficient approach
	 */
	public static boolean isAna(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;

		int[] count = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}

		for (int i = 0; i < 256; i++)
			if (count[i] != 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isAna("una", "ana"));
	}

}
