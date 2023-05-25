package com.denisfesenko.leetcode.easy;

import java.util.Arrays;

/**
 * 66. Plus One
 */
public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
    }

    public static int[] plusOne(int[] digits) {
        int size = digits.length;
        for (int i = size - 1; i >= 0; i--) {
            if (digits[i] + 1 > 9) {
                if (i == 0) {
                    int[] result = new int[size + 1];
                    result[0] = 1;
                    for (int j = 1; j < result.length; j++) {
                        result[j] = 0;
                    }
                    return result;
                } else {
                    digits[i] = 0;
                }
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        return digits;
    }
}
