package com.gfg.strings;

public class FindUncommonCharacters {

	public static void main(String[] args) {
		String str1 = "banglore";
		String str2 = "manglore";
		findAndPrintUncommonChars(str1, str2);
	}

	private static void findAndPrintUncommonChars(String str1, String str2) {
		int[] present = new int[26];

		int l1 = str1.length();
		int l2 = str2.length();

		// for each character of str1, mark its
		// presence as 1 in 'present[]'
		for (int i = 0; i < l1; i++) {
			present[str1.charAt(i) - 'a'] = 1;
		}

		// for each character of str2
		for (int i = 0; i < l2; i++) {

			// if a character of str2 is also present
			// in str1, then mark its presence as -1
			if (present[str2.charAt(i) - 'a'] == 1) {
				present[str2.charAt(i) - 'a'] = -1;
			}

			// else mark its presence as 2
			else {
				present[str2.charAt(i) - 'a'] = 2;
			}
		}

		// print all the uncommon characters
		for (int i = 0; i < 26; i++) {
			if (present[i] == 1 || present[i] == 2) {
				System.out.print((char) (i + 'a') + " ");
			}
		}
	}

}
