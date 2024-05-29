package com.gfg.Searching;

public class SquareRoot {

	public static void main(String[] args) {
		int no = 81;
		System.out.println("Square root of " + no + " is " + sqRoot(no));
	}

	/*
	 * θ(√no)
	 */
	private static int sqRoot(int no) {
		int i = 1;

		while (i * i <= no)
			i++;

		return (i - 1);
	}

}
