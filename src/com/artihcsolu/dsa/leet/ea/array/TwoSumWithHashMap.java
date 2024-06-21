package com.artihcsolu.dsa.leet.ea.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * This class provides methods to find pairs of numbers in an array that add up to a target value using a HashMap.
 */
public class TwoSumWithHashMap {

    /**
     * Finds two numbers in the given array that add up to the target value.
     * TC : O(n)
     * SC : O(n)
     *
     * @param nums   the array of integers
     * @param target the target value
     * @return an array containing the indices of the two numbers that add up to the target value
     */
    public int[] twoSum(int[] nums, int target) {

        java.util.HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    /**
     * Finds all pairs of numbers in the given array that add up to the target value.
     * TC : O(n)
     * SC : O(n)
     *
     * @param nums   the array of integers
     * @param target the target value
     * @return a list of arrays, each containing a pair of numbers that add up to the target value
     */
    public List<int[]> twoSumMap(int[] nums, int target){
        final List<int[]> allDifferentPairs = new ArrayList<>();
        Map<Integer, Integer> pairs = new HashMap<>();
        IntStream.range(0, nums.length).forEach(i -> {
            if (pairs.containsKey(nums[i])) {
                if (pairs.get(nums[i]) != null) {
                    allDifferentPairs.add(new int[]{nums[i],target - nums[i]});
                }
                pairs.put(target - nums[i], null);
            } else if (!pairs.containsValue(nums[i])) {
                pairs.put(target - nums[i], nums[i]);
            }
        });
        return allDifferentPairs;
    }

    public static void main(String[] args) {
        int[] nums = {2, 11,15,12,4,5,1,8,7};
        int target = 9;
        TwoSumWithHashMap twoSum = new TwoSumWithHashMap();
        List<int[]> resultList = twoSum.twoSumMap(nums, target);
        resultList.forEach(result -> {
            System.out.println(result[0] + " " + result[1]);
        });
    }
}
