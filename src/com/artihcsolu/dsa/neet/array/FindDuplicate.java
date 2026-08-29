package com.artihcsolu.dsa.neet.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
* Given an integer array nums, return true if any value appears more than once in the array, 
otherwise return false.
 * TC : O(n)
 * SC : O(n)
 */
public class FindDuplicate {

    /* Option 1
     Brute Force Method: We can check every pair of different elements in the array
     * TC : O(n^2)
     * SC : O(1)
     */
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Option 2
     If we sort the array, then any duplicate values will appear next to each other.
Sorting groups identical elements together, so we can simply check adjacent positions to detect duplicates
     * TC : O(n log n)
     * SC : O(1) Or O(n)
     */
    public boolean hasDuplicateViaSorting(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    /* Option 3
     We can use a hash set to efficiently keep track of the values we have already encountered.
As we iterate through the array, we check whether the current value is already present in the set.
     * TC : O(n)
     * SC : O(n)
     */
    public boolean hasDuplicateViaHashSet(int[] nums) {
        Set<Integer> element = new HashSet<Integer>();
        for (int num : nums) {
            if(element.contains(num)){
                return true;
            }
            element.add(num);
        }
        return false;
    }

    /* Option 4
     We will removing the duplicate elements and then compaire the length with the original array.
     * TC : O(n)
     * SC : O(n)
     */
    public boolean hasDuplicateViaLength(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        FindDuplicate findDuplicate = new FindDuplicate();

        System.out.println(findDuplicate.hasDuplicateViaLength(nums));
    }
}
