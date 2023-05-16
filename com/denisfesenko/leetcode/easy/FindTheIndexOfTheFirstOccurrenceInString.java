package com.denisfesenko.leetcode.easy;

/**
 * 28. Find the Index of the First Occurrence in a String
 */
public class FindTheIndexOfTheFirstOccurrenceInString {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
