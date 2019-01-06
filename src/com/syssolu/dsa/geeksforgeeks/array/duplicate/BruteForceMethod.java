package com.syssolu.dsa.geeksforgeeks.array.duplicate;

/**
 * Java program to find duplicate element in array
 * TC : O(n^2)
 * SC : NA
 */

/*
 * We compare each element of an array with other elements. If any two elements are found equal, we declare them as duplicates.
 * Performance is not good if an array contains lots of elements
 * */

public class BruteForceMethod {
	public static void main(String args[]) {
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i].equalsIgnoreCase(strArray[j]) && i != j) {
					System.out.println("Duplicate element:-> " + strArray[i]);
				}
			}
		}
	}
}
