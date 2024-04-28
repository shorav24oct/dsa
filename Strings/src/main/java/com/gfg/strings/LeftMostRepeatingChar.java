package com.gfg.strings;

public class LeftMostRepeatingChar {

	public static void main(String[] args) {
		System.out.println(leftMostRepeatChar("aabc"));
	}

	/*
	 * using Naive approach
	 */
	private static int leftMostRepeatChar(String s) {
		for (int i = 0; i < s.length(); i++)
			for (int j = i + 1; j < s.length(); j++)
				if (s.charAt(i) == s.charAt(j))
					return i;
		return -1;
	}

}
