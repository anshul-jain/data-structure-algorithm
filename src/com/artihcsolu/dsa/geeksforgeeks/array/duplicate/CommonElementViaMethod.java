package com.artihcsolu.dsa.geeksforgeeks.array.duplicate;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Java program to find Common Element Via Method in array
 * TC : NA
 * SC : NA
 */

/*
 * We will use the inbuild methods to find the common elements
 * */

public class CommonElementViaMethod {
	public static void main(String[] args) {
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

		HashSet<String> s1Set = new HashSet<String>(Arrays.asList(s1));
		HashSet<String> s2Set = new HashSet<String>(Arrays.asList(s2));

		s1Set.retainAll(s2Set);
		System.out.println("Common elements are :-> " + s1Set);
	}
}
