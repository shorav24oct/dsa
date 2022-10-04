package com.gfg.strings;

public class FrequenciesOfChar {

	public static void main(String[] args) {
		String input = "geeksforgeeks";
		int[] count = new int[26];

		for (int i = 0; i < input.length(); i++)
			count[input.charAt(i) - 'a']++;

		for (int i = 0; i < 26; i++)
			if (count[i] > 0)
				System.out.println((char) (i + 'a') + " " + count[i]);

	}

}
