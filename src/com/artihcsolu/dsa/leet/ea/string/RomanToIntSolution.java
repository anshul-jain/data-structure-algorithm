package com.artihcsolu.dsa.leet.ea.string;

import java.util.HashMap;

/**
 * The RomanToIntSolution class is used to convert a Roman numeral to an
 * integer.
 * It provides a method `RomanToInt` that takes a Roman numeral as input and
 * returns the corresponding integer value.
 */
public class RomanToIntSolution {
    public int RomanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int answer = romanMap.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                answer -= romanMap.get(s.charAt(i));
            } else {
                answer += romanMap.get(s.charAt(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RomanToIntSolution romanToInt = new RomanToIntSolution();
        System.out.println(romanToInt.RomanToInt("IV"));
    }

}
