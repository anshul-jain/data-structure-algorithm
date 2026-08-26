package com.artihcsolu.dsa.neet.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different
 * TC : O(m* n log n)
 * SC : O(m*n)
*/
public class GroupAnagram {
     public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            result.putIfAbsent(sortedString, new ArrayList<>());
            result.get(sortedString).add(str);
        }
        return new ArrayList<>(result.values());
    }

    public static void main(String[] args) {
        String[] str = {"act","pots","tops","cat","stop","hat"};
        GroupAnagram ga = new GroupAnagram();
        //ga.groupAnagrams(str);
        ga.groupAnagrams(str).forEach(System.out::println);
    }
}
