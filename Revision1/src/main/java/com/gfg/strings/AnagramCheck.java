package com.gfg.strings;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		System.out.println(isAna1("mat", "pat"));
		System.out.println(isAna2("cat", "atc"));
	}

	static boolean isAna1(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();

		Arrays.sort(str1);
		Arrays.sort(str2);

		s1 = new String(str1);
		s2 = new String(str2);

		return s1.equals(s2);
	}

	static boolean isAna2(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		int[] count = new int[256];

		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}

		for (int i = 0; i < 256; i++)
			if (count[i] != 0)
				return false;

		return true;
	}

}
