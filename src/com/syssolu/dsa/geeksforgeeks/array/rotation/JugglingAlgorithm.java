package com.syssolu.dsa.geeksforgeeks.array.rotation;

import java.util.Arrays;

public class JugglingAlgorithm {
	public static void main(String args[]) {
		RotateByOne usingTempArray = new RotateByOne();
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 9, 10, 16};
		System.out.println("Array before changes " + Arrays.toString(arr));
		usingTempArray.leftRotate(arr, 8);
		System.out.println("Array after changes " + Arrays.toString(arr));
	}

	void leftRotate(int inputArray[], int position, int size) {
		int i, j, k, temp;
		for (i = 0; i < gcd(position, size); i++) {
			/* move i-th values of blocks */
			temp = inputArray[i];
			j = i;
			while (true) {
				k = j + position;
				if (k >= size)
					k = k - size;
				if (k == i)
					break;
				inputArray[j] = inputArray[k];
				j = k;
			}
			inputArray[j] = temp;
		}
	}

	/*Fuction to get gcd of a and b*/
	int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}
//Time complexity : O(n)
