package com.artihcsolu.dsa.geeksforgeeks.string;

/**
 * Java program to swap first and last character in string
 * TC : NA
 * SC : NA
 */

/*
 * 1. Split the string with space(Assuming single space)
 * 2. Convert the converted strings into char array
 * 3. Swap the elements
 * */

public class SwapFirstLastChar {
	public static void main(String args[]) {
		String str = "check for string";
		swap(str);
	}

	private static void swap(String str) {
		String[] strArray = str.split(" ");
		String output = "";
		for (int i = 0; i < strArray.length; i++) {
			int last = strArray[i].length();
			char[] charArray = strArray[i].toCharArray();
			char temp = charArray[0];
			charArray[0] = charArray[last - 1];
			charArray[last - 1] = temp;
			output += " " + new String(charArray);
		}
		System.out.println(output);
	}
}
