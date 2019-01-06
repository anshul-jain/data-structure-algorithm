package com.syssolu.dsa.geeksforgeeks.array.search;

/**
 * Java program to rotate an array by d elements
 * TC : O(n^2)
 * SC : NA
 */

/*
 * We compare each element of an array with other elements. If any two elements are found equal, we declare them as duplicates.
 * Performance is not good if an array contains lots of elements
 * */

public class MissingNumberInArray {
	public static void main(String args[]) {
		int n = 8;
		int[] a = {1, 4, 5, 3, 7, 8, 6};
		int sumOfNnumbers = sumOfNumbers(n);
		int sumOfElements = sumOfElements(a);
		int missingElement = sumOfNnumbers - sumOfElements;
		System.out.println(missingElement);
	}

	private static int sumOfElements(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	private static int sumOfNumbers(int n) {
		return n * (n + 1) / 2;
	}
}
