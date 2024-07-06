package com.gfg.strings;

public class LeftMostRepeatingChar {

	public static void main(String[] args) {
		System.out.println(lmRepeatingChar1("abbcc"));
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

}
