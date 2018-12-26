package com.syssolu.dsa.geeksforgeeks.array.rotation;

/**
 * Java program to rotate an array by d elements
 * TC : O(n)
 * SC : O(d)
 */

import java.util.Arrays;

public class UsingTempArray {

	public static void main(String args[]) {
		UsingTempArray usingTempArray = new UsingTempArray();
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("Array before changes " + Arrays.toString(arr));
		usingTempArray.leftRotate(arr, 3, 7);
		System.out.println("Array after changes " + Arrays.toString(arr));

	}

	void leftRotate(int arr[], int elements, int size) {
		int tempArray[] = Arrays.copyOfRange(arr, 0, elements);
		for (int i = 0; i < size - elements; i++) {
			arr[i] = arr[elements + i];
		}
		int i = 0, j = 0;
		for (i = size - elements; j < elements && i <= size; i++, j++) {
			arr[i] = tempArray[j];
		}
	}
}
