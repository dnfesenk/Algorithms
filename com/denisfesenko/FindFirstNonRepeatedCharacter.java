package com.denisfesenko;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Find the first non-repeated character in a string
 * Write a Java function that takes a string as input and returns the first non-repeated character in the string.
 * If all characters are repeated or the string is empty, return null.
 **/
public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatedCharacterOne("134567872654283431"));
        System.out.println(findFirstNonRepeatedCharacterTwo("134567872654283431"));
    }

    public static Character findFirstNonRepeatedCharacterOne(String input) {
        if (!input.isEmpty()) {
            var map = new HashMap<Character, Integer>();
            var array = input.toCharArray();
            var length = input.length();
            map.put(array[0], 1);
            for (var i = 1; i < length; i++) {
                if (map.containsKey(array[i])) {
                    map.put(array[i], map.get(array[i]) + 1);
                } else {
                    map.put(array[i], 1);
                }
            }
            for (var i = 0; i < length; i++) {
                if (map.get(array[i]) == 1) {
                    return array[i];
                }
            }
        }
        return null;
    }

    /**
     * In this version, we first check if the input is null or blank and return null if it is.
     * We then use a LinkedHashMap to maintain the order of character insertion.
     * This allows us to iterate through the LinkedHashMap's entry set and return the first character with a count of 1.
     * This modification retains the O(n) time complexity and improves the code readability.
     */
    public static Character findFirstNonRepeatedCharacterTwo(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        var map = new LinkedHashMap<Character, Integer>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }
}
