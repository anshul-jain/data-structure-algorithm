package com.artihcsolu.dsa.geeksforgeeks.random;


/**
 * Java program to find GCD of two numbers
 * TC : O(Log min(a, b))
 * SC : NA
 */
public class GCDExample {
	public static void main(String[] args) {
		int num1 = 98, num2 = 56;
		int gcd = findGCD(num1, num2);
		System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
	}

	/*
	 * Java method to find GCD of two number using Euclid's method
	 * @return GDC of two numbers in Java
	 */
	private static int findGCD(int number1, int number2) {
		//base case
		if (number2 == 0) {
			return number1;
		}
		return findGCD(number2, number1 % number2);
	}
}
