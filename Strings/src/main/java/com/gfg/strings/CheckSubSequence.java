package com.gfg.strings;

public class CheckSubSequence {

	public static void main(String[] args) {
		String s1 = "test";
		String s2 = "ge";
		System.out.println(isSubSeq(s1, s2, s1.length(), s2.length()));
	}

	private static boolean isSubSeq(String s1, String s2, int n, int m) {
		int j = 0;

		for (int i = 0; i < n && j < m; i++) {
			if (s1.toCharArray()[i] == s2.toCharArray()[j])
				j++;
		}

		if (j == m)
			return true;
		else
			return false;
	}

}
