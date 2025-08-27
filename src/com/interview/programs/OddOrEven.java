package com.interview.programs;

public class OddOrEven {

	public static void main(String[] args) {
		System.out.println(findPrimeNumber(5));
	}

	static String findPrimeNumber(int num) {

		if (num == 0 || num <= 1) {
			return "NOT PRIME";
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return "NOT PRIME";
			}
		}

		return "PRIME";

	}
}
