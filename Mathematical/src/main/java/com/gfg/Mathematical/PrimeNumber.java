package com.gfg.Mathematical;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(checkPrime(7));
	}

	private static boolean checkPrime(int no) {
		int count = 0;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				count++;
			}
		}
		
		boolean result = (count >= 1) ? false : true;
		return result;
	}

}
