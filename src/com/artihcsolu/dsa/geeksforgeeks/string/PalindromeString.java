package com.artihcsolu.dsa.geeksforgeeks.string;

/**
 * Java program to find Palindrome String
 * TC : NA
 * SC : NA
 */
public class PalindromeString {

	public boolean isPalindrome(String x) {
		String revString = "";
		StringBuilder stringBuilder = new StringBuilder(x);
		revString = stringBuilder.reverse().toString();
		return x.equals(revString);
	}
	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		System.out.println(palindromeString.isPalindrome("aba"));
	}
}
