package com.syssolu.dsa.geeksforgeeks.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java program to check whether the given string is integer
 * TC : NA
 * SC : NA
 */
public class CheckIfInteger {
	public static void main(String args[]) {
		String str = "-1";
		String regex = "^-?\\d+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		if (matcher.find()) {
			System.out.println("Its integer");
		} else {
			System.out.println("Its not a integer");
		}
	}
}
