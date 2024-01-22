package com.gfg.Mathematical;

public class Fibonacci {

	public static void main(String[] args) {
		Fib(5);
	}

	/*
	 * Fib(N) = Fib(N - 1) + Fib(N - 2)
	 */
	private static void Fib(int no) {
		int a = 0;
		int b = 1;

		if (no < 0)
			System.out.println("N cannot be negative");

		if (no == 0)
			System.out.println(a);
		else if (no == 1)
			System.out.println(b);
		else {
			int c = 0;
			for (int i = 2; i <= no; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println(c);
		}

	}

}
