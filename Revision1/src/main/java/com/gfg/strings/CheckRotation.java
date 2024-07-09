package com.gfg.strings;

public class CheckRotation {

	public static void main(String[] args) {
		System.out.println(rotable("ABCD", "DABc"));
	}

	static boolean rotable(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;

		if ((str1 + str1).indexOf(str2) >= 0)
			return true;
		else
			return false;

	}

}
