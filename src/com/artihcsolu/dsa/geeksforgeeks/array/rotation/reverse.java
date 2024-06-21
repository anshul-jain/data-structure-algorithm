package com.artihcsolu.dsa.geeksforgeeks.array.rotation;

import java.util.Arrays;
import java.util.Collections;

public class reverse {
	public static void main(String args[]) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("Array before changes " + Arrays.asList(arr));
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));
	}
}
