package com.gfg.Mathematical;

public class PrimeNumber {

	public static void main(String[] args) {
		// System.out.println(checkPrime(701));
		// System.out.println(checkPrimeEfficient(9));
		System.out.println(checkPrimeMoreEfficient(131));
	}

	// naive method
	// time complexity O(n)
	private static boolean checkPrime(int no) {

		if (no == 1)
			return false;

		for (int i = 2; i < no; i++)
			if (no % i == 0)
				return false;

		return true;
	}

	// efficient solution
	// time complexity O(√n)
	private static boolean checkPrimeEfficient(int no) {
		if (no == 1)
			return false;

		for (int i = 2; i * i <= no; i++)
			if (no % i == 0)
				return false;

		return true;
	}

	// efficient solution
	// time complexity 1/3 times of O(√n)
	private static boolean checkPrimeMoreEfficient(int no) {
		if (no == 1)
			return false;

		if (no == 2 || no == 3)
			return true;

		if (no % 2 == 0 || no % 3 == 0)
			return false;

		for (int i = 5; i * i <= no; i = i + 6)
			if (no % i == 0 || no % (i + 2) == 0)
				return false;

		return true;
	}

}
