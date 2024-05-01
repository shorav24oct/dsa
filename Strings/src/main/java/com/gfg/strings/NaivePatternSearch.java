package com.gfg.strings;

public class NaivePatternSearch {

	public static void main(String[] args) {
		String text = "aaaa";
		String pattern = "aa";
		patternSearch(pattern, text, pattern.length(), text.length());
	}

	private static void patternSearch(String pattern, String text, int m, int n) {
		int j = 0, i = 0;
		
		for (i = 0; i <= n - m; i++) {
			for (j = 0; j < m; j++) {
				if (pattern.charAt(j) != text.charAt(i + j))
					break;
			}
			if (j == m)
				System.out.print(i + " ");
		}
	}

}
