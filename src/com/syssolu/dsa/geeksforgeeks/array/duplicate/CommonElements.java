package com.syssolu.dsa.geeksforgeeks.array.duplicate;

import java.util.HashSet;

/**
 * Java program to rotate an array by d elements
 * TC : NA
 * SC : NA
 */

/*
 * We will compare each element from first set to another set and will add to the set
 * and then print the commonElements to show the CommonElements
 * */

public class CommonElements {
	public static void main(String[] args) {
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

		HashSet<String> commonElements = new HashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equalsIgnoreCase(s2[j])) {
					commonElements.add(s1[i]);
				}
			}
		}
		System.out.println("Common elements are :-> " + commonElements);
	}
}
