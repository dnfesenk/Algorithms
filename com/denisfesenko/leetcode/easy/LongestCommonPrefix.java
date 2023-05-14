package com.denisfesenko.leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 14. Longest Common Prefix
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix1(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix1(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix2(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix2(new String[]{"dog", "racecar", "car"}));
    }

    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        List<String> list = Arrays.asList(strs);
        list.sort(Comparator.naturalOrder());
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (char cFirst : list.get(0).toCharArray()) {
            char[] cLastArray = list.get(list.size() - 1).toCharArray();
            if (cFirst == cLastArray[i]) {
                result.append(cFirst);
                i++;
            } else {
                return result.toString();
            }
        }
        return result.toString();
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
