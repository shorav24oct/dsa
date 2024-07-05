package com.gfg.strings;

public class PrintSubstrings {

	public static void main(String[] args) {
		printSubStr("abc");
	}
	
	static void printSubStr(String str) {
		for (int i = 0; i < str.length(); i++) {
			String subStr = "";
			for (int j = i; j < str.length(); j++) {
				subStr += str.charAt(j);
				System.out.println(subStr);
			}
		}
	}

}
