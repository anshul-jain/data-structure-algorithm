package com.artihcsolu.dsa.leet.ea.array;

/**
 * The TwoSum class provides a method to find two numbers in an array that add up to a given target. Bruteforce approach.
 * TC : O(n^2)
 * SC : O(1)
 */
public class TwoSum {
    /**
     * Finds two numbers in the given array that add up to the target.
     *
     * @param nums   the array of numbers
     * @param target the target sum
     * @return an array containing the indices of the two numbers that add up to the target
     */
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 11, 15,12,4,5,1,8,7};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
