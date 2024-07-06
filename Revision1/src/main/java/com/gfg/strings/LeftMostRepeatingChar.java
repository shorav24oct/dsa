package com.gfg.strings;

public class LeftMostRepeatingChar {

	public static void main(String[] args) {
		System.out.println(lmRepeatingChar2("abcc"));
	}

	/*
	 * Naive solution
	 */
	static int lmRepeatingChar1(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					return i;
			}
		}
		return -1;
	}

	/*
	 * better approach
	 */
	static int lmRepeatingChar2(String str) {
		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;

		for (int i = 0; i < str.length(); i++)
			if (count[str.charAt(i)] > 1)
				return i;

		return -1;
	}

}
