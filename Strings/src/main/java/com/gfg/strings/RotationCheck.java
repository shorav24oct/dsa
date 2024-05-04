package com.gfg.strings;

public class RotationCheck {

	public static void main(String[] args) {
		System.out.println(checkRotation("ABCD", "CDAB"));
	}

	private static boolean checkRotation(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		if ((s1 + s1).indexOf(s2) >= 0)
			return true;
		else
			return false;
	}

}
