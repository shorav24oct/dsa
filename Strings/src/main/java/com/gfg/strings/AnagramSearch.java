package com.gfg.strings;

import java.util.Arrays;

public class AnagramSearch {

	private static final int CHAR = 256;

	public static void main(String[] args) {
		String text = "ABCD";
		String pattern = "DC";
		System.out.println(isPresent(text, pattern));
	}

	private static boolean isPresent(String text, String pattern) {
		int[] countText = new int[CHAR];
		int[] countPattern = new int[CHAR];

		for (int i = 0; i < pattern.length(); i++) {
			countText[text.charAt(i)]++;
			countPattern[pattern.charAt(i)]++;
		}

		for (int i = pattern.length(); i < text.length(); i++) {
			if (areSame(countText, countPattern))
				return true;

			countText[text.charAt(i)]++;
			countText[text.charAt(i - pattern.length())]--;
		}
		return false;
	}

	private static boolean areSame(int[] countText, int[] countPattern) {
		return Arrays.equals(countPattern, countText);
	}

}
