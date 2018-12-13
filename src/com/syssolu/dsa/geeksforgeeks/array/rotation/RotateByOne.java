package com.syssolu.dsa.geeksforgeeks.array.rotation;

import java.util.Arrays;

public class RotateByOne {
	public static void main(String args[]) {
		RotateByOne usingTempArray = new RotateByOne();
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("Array before changes " + Arrays.toString(arr));
		usingTempArray.leftRotate(arr, 5);
		System.out.println("Array after changes " + Arrays.toString(arr));
	}

	void leftRotate(int inputArray[], int position) {
		int temp;

		for (int i = 0; i < position; i++) {
			temp = inputArray[0];

			for (int j = 0; j < inputArray.length - 1; j++) {
				inputArray[j] = inputArray[j + 1];
			}

			inputArray[inputArray.length - 1] = temp;
		}
	}
}
