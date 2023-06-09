package com.denisfesenko;

import java.util.Arrays;
import java.util.List;

/**
 * Hackerrank Group Anagrams
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        System.out.println(getGroupedAnagrams(List.of("eat", "tea", "tan", "ate", "nat", "bat")));
    }

    public static int getGroupedAnagrams(List<String> words) {
        return (int) words.stream().map(s -> {
            var array = s.toCharArray();
            Arrays.sort(array);
            return String.valueOf(array);
        }).distinct().count();
    }
}
