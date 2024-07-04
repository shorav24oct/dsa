package com.gfg.strings;

public class FrequencyOfChar {

	public static void main(String[] args) {
		freq("aaa");
	}

	static void freq(String str) {
		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i) - 'a']++;

		for (int i = 0; i < 256; i++) {
			if (count[i] > 0) {
				System.out.println((char) (i + 'a') + " " + count[i]);
			}
		}

	}

}
