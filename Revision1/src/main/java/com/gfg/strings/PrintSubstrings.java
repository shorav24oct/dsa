package com.gfg.strings;

public class PrintSubstrings {

	public static void main(String[] args) {
		printSubStr2("abc");
	}

	static void printSubStr1(String str) {
		for (int i = 0; i < str.length(); i++) {
			String subStr = "";
			for (int j = i; j < str.length(); j++) {
				subStr += str.charAt(j);
				System.out.println(subStr);
			}
		}
	}

	static void printSubStr2(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++)
				System.out.println(str.substring(i, j));
		}
	}

}
