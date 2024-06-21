package com.artihcsolu.dsa.geeksforgeeks.string;

public class MissingChar {

	public static void main(String[] args) {
		missingChar("kitten", 1);
	}

	public static String missingChar(String str, int n) {
		String front = str.substring(0, 0);
		System.out.println(front + str);
		String back = str.substring(n + 1, str.length());
		//str.equals()
		return front + back;
	}
}
