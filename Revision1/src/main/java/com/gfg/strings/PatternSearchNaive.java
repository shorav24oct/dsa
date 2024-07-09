package com.gfg.strings;

public class PatternSearchNaive {

	public static void main(String[] args) {

		String text = "abab";
		String pattern = "ab";

		patternSearch(text, pattern);
	}

	private static void patternSearch(String text, String pattern) {
		int m = text.length();
		int n = pattern.length();
		int j = 0;

		for (int i = 0; i <= m - n; i++) {

			for (j = 0; j < n; j++)
				if (pattern.charAt(j) != text.charAt(i + j))
					break;

			if (j == n)
				System.out.print(i + " ");
		}

	}

}
