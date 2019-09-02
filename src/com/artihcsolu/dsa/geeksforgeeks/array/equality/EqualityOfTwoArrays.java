package com.artihcsolu.dsa.geeksforgeeks.array.equality;

import java.util.Arrays;

/**
 * Java program to find equality of two arrays
 * TC : NA
 * SC : NA
 */

/*
 * We use the inbuild methods from util.Arrays to compare this will only work if the given array having
 * same number of elements and in same order.
 * */

public class EqualityOfTwoArrays {
	public static void main(String args[]) {
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		String[] strArray1 = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		System.out.println("Given arrays are ->" + Arrays.equals(strArray, strArray1));
	}
}
