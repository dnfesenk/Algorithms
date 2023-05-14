package com.denisfesenko.leetcode.easy;

import java.util.Arrays;

/**
 * 26. Remove Duplicates from Sorted Array
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(array));
        System.out.println(Arrays.toString(array));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
