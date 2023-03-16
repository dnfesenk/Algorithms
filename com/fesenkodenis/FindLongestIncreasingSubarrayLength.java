package com.fesenkodenis;

/**
 * Find the length of the longest increasing subarray
 * Write a Java function that takes an integer array as input and returns the length of the longest increasing subarray.
 * <p>
 * This implementation first checks if the input array is null or empty; if it is, it returns 0.
 * Then, it iterates through the array, comparing each element to the previous one.
 * If the current element is greater than the previous one, it increments the currentLength.
 * If not, it resets currentLength to 1. The function keeps track of the maximum length found so far in
 * maxLength and updates it as necessary. This solution has a time complexity of O(n), where n is the length of the input array.
 **/
public class FindLongestIncreasingSubarrayLength {
    public static void main(String[] args) {
        System.out.println(findLongestIncreasingSubarrayLength(new int[]{3, 4, 1, 2, 8, 5, 6, 7}));
    }

    public static int findLongestIncreasingSubarrayLength(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
