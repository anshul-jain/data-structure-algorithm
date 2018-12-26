package com.syssolu.dsa.geeksforgeeks.array.rotation;

/**
 * Java program to rotate an array by d elements
 * TC : O(n * d)
 * SC : O(1)
 */

import java.util.Arrays;

public class RotateByOneRightDirection {
	public static void main(String args[]) {
		RotateByOneRightDirection usingTempArray = new RotateByOneRightDirection();
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("Array before changes " + Arrays.toString(arr));
		usingTempArray.rightRotate(arr, 2);
		System.out.println("Array after changes " + Arrays.toString(arr));
	}

	void rightRotate(int inputArray[], int position) {
		int temp;

		for (int i = 0; i < position; i++) {
			temp = inputArray[inputArray.length - 1];

			for (int j = inputArray.length - 1; j > 0; j--) {
				inputArray[j] = inputArray[j - 1];
			}

			inputArray[0] = temp;
		}
	}
}
