package com.denisfesenko;

/**
 * 410. Split Array Largest Sum
 */
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{1, 2, 3, 4, 5}, 2)); //9
    }

    public static int splitArray(int[] nums, int m) {
        long left = 0;
        long right = 0;
        for (int num : nums) {
            right += num;
            if (left < num) {
                left = num;
            }
        }
        while (left < right) {
            long mid = (left + right) / 2;
            if (valid(mid, nums, m)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return (int) left;
    }

    public static boolean valid(long target, int[] nums, int m) {
        int count = 1;
        long total = 0;
        for (int num : nums) {
            total += num;
            if (total > target) {
                total = num;
                count++;
                if (count > m) {
                    return false;
                }
            }
        }
        return true;
    }
}
