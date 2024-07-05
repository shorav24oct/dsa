package com.gfg.strings;

public class SubSeqOfOther {

	public static void main(String[] args) {
		String mainString = "sharma";
		String subStr = "ma";
		System.out.println(subSequence(mainString, subStr, mainString.length(), subStr.length()));
	}

	static boolean subSequence(String mainString, String subStr, int m, int n) {
		int j = 0;

		for (int i = 0; i < m && j < n; i++) {
			if (mainString.charAt(i) == subStr.charAt(j))
				j++;
		}
		if (j == n)
			return true;
		else
			return false;
	}

}
