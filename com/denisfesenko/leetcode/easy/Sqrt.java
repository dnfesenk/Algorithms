package com.denisfesenko.leetcode.easy;

/**
 * 69. Sqrt(x)
 */
public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long start = 0;
        long end = x;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int) mid;
            }
            if (mid * mid < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) start - 1;
    }
}
