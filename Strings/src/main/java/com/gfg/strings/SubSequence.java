package com.gfg.strings;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {

	static List<String> al = new ArrayList<>();

	/*
	 * Time complexity: O( n^3 )
	 */
	public static void SubString(String str, int n) {
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j <= n; j++)
				System.out.println(str.substring(i, j));
	}

	/*
	 * Time complexity: O(N2)
	 */
	static void printSubStrings(String str) {

		// First loop for starting index
		for (int i = 0; i < str.length(); i++) {
			String subStr = "";

			// Second loop is generating sub-String
			for (int j = i; j < str.length(); j++) {
				subStr += str.charAt(j);
				System.out.print(subStr + "\n");
			}
		}
	}

	/*
	 * Time Complexity: O(2^n)
	 */
	private static void findsubsequences(String s, String ans) {
		if (s.length() == 0) {
			al.add(ans);
			return;
		}
		findsubsequences(s.substring(1), ans + s.charAt(0));
		findsubsequences(s.substring(1), ans);
	}

	public static void main(String[] args) {
		String str = "abc";
		//SubString(str, str.length());
		System.out.println("------------------");
		//printSubStrings(str);
		System.out.println("------------------");
		findsubsequences("ab", "");
		System.out.println(al);
	}
}
