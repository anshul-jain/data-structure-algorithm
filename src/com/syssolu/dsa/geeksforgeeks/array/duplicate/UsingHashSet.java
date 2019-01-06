package com.syssolu.dsa.geeksforgeeks.array.duplicate;

import java.util.HashSet;

/**
 * Java program to rotate an array by d elements
 * TC : O(n)
 * SC : NA
 */

/*
 * We use the concept of Hash set which only allows the unique elements
 * */

public class UsingHashSet {
	public static void main(String args[]) {
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		HashSet<String> hashSet = new HashSet<String>();
		for (String s : strArray) {
			if (!hashSet.add(s)) {
				System.out.println("Duplicate element:-> " + s);
			}
		}
	}
}
