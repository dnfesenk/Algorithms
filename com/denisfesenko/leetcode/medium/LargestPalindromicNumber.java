package com.denisfesenko.leetcode.medium;

/**
 * You are given a string S, consisting entirely of decimal digits (0-9). Your task is to create the largest possible
 * palindromic number using the digits from S. You must use at least one digit, and you can reorder the digits as needed.
 * A palindromic number is a number that reads the same when its digits are reversed, such as "7", "44", or "83238".
 * However, any palindromic number you create should not have leading zeros, like "0990" or "010".
 * For example, the possible palindromic numbers that can be created from "8199" are: "1", "8", "9", "99", "919", and "989".
 * Among these, "989" is the largest. This function should take a string S containing N digits and return the string
 * representing the largest palindromic number that can be formed.
 */
class LargestPalindromicNumber {

    public static void main(String[] args) {
        LargestPalindromicNumber sol = new LargestPalindromicNumber();
        System.out.println(sol.solution("39878")); // Output: "898"
        System.out.println(sol.solution("00900")); // Output: "9"
        System.out.println(sol.solution("0000")); // Output: "0"
        System.out.println(sol.solution("54321")); // Output: "5"
        System.out.println(sol.solution("8199")); // Output: "989"
        System.out.println(sol.solution("444947137")); // Output: "7449447"
        System.out.println(sol.solution("00009")); // Output: "9"
    }

    public String solution(String num) {
        int[] count = new int[10];
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            count[Character.digit(c, 10)]++;
        }

        StringBuilder leftPart = new StringBuilder();
        String mid = "";

        for (int i = 9; i >= 0; i--) {
            while (count[i] > 1) {
                if (leftPart.length() != 0 || i != 0) {
                    leftPart.append(i);
                }
                count[i] -= 2;
            }
            if (count[i] == 1 && mid.isEmpty()) {
                mid = String.valueOf(i);
            }
        }

        StringBuilder rightPart = new StringBuilder(leftPart).reverse();
        String palindrome = leftPart + mid + rightPart;

        if (palindrome.isEmpty()) {
            return "0";
        }

        return palindrome;
    }
}
