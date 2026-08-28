package com.artihcsolu.dsa.neet.array;

/*
* Given an integer array nums, return true if any value appears more than once in the array, 
otherwise return false.
 * TC : O(n)
 * SC : O(n)
 */
public class FindDuplicate {

    // Option 1
    // Brute Force Method: We can check every pair of different elements in the array
    public boolean isDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 3};
        FindDuplicate findDuplicate = new FindDuplicate();

        System.out.println(findDuplicate.isDuplicate(nums));
    }
}
