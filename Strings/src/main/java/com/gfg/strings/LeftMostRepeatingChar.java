package com.gfg.strings;

public class LeftMostRepeatingChar {

	public static void main(String[] args) {
		System.out.println(leftMostRepeatChar2("abbccbb"));
	}

	/*
	 * using Naive approach
	 */
	private static int leftMostRepeatChar1(String s) {
		for (int i = 0; i < s.length(); i++)
			for (int j = i + 1; j < s.length(); j++)
				if (s.charAt(i) == s.charAt(j))
					return i;
		return -1;
	}

	/*
	 * better approach
	 */
	private static int leftMostRepeatChar2(String s) {
		int[] count = new int[256];

		for (int i = 0; i < s.length(); i++)
			count[s.charAt(i)]++;

		for (int i = 0; i < s.length(); i++)
			if (count[s.charAt(i)] > 1)
				return i;
		return -1;
	}

}
