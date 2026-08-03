package com.artihcsolu.dsa.neet.array;

import java.util.Arrays;

/*
* Concatenation of Array
 * TC : O(n)
 * SC : O(n)
 */
public class ArrConcatenation {

    public int[] getConcatenation(int[] nums) {
        int result[] = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 2, 1, 5};
        ArrConcatenation arrConcatenation = new ArrConcatenation();
        int result[] = arrConcatenation.getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}
