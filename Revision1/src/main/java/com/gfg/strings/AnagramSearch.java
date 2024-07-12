package com.gfg.strings;

import java.util.Arrays;

public class AnagramSearch {

	public static void main(String[] args) {
		String text = "geeksforgeeks";
		String pattern = "frog";
		System.out.println(isPresent(text, pattern));
	}

	static boolean isPresent(String text, String pattern) {
		int[] CT = new int[256];
		int[] CP = new int[256];

		for (int i = 0; i < pattern.length(); i++) {
			CT[text.charAt(i)]++;
			CP[pattern.charAt(i)]++;
		}

		for (int i = pattern.length(); i < text.length(); i++) {
			if (areSame(CT, CP))
				return true;
			CT[text.charAt(i)]++;
			CT[text.charAt(i - pattern.length())]--;
		}
		return false;
	}

	private static boolean areSame(int[] cT, int[] cP) {
		return Arrays.equals(cT, cP);
	}

}
