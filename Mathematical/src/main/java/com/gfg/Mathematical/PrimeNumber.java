package com.gfg.Mathematical;

public class PrimeNumber {

	public static void main(String[] args) {
		//System.out.println(checkPrime(701));
		System.out.println(checkPrimeEfficient(9));
	}

	// naive method
	private static boolean checkPrime(int no) {

		if (no == 1)
			return false;

		for (int i = 2; i < no; i++)
			if (no % i == 0)
				return false;

		return true;
	}

	// efficient solution

	private static boolean checkPrimeEfficient(int no) {
		if (no == 1)
			return false;

		for (int i = 2; i * i <= no; i++)
			if (no % i == 0)
				return false;

		return true;
	}

}
