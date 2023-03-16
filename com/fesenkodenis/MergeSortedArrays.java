package com.fesenkodenis;

import java.util.Arrays;

/**
 * Merge two sorted arrays
 * Write a Java function that takes two sorted integer arrays as input and returns a new
 * sorted array containing all the elements of both input arrays.
 * <p>
 * This implementation uses three indices to keep track of the positions in the two input arrays and the merged array.
 * It iterates through the input arrays, comparing elements and adding the smaller one to the merged array.
 * When one of the input arrays is exhausted, the function adds the remaining elements from the other array to the merged array.
 * This solution has a time complexity of O(n), where n is the total length of the input arrays (array1.length + array2.length).
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 4, 6, 8})));
    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];

        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Copy remaining elements from array1, if any
        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        // Copy remaining elements from array2, if any
        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}
