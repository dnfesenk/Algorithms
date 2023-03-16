package com.fesenkodenis;

import java.util.HashMap;
import java.util.Map;

/**
 * Write java function which calculates number of pairs in array.
 * Pair is when two numbers added together, result is zero.
 * <p>
 * This function uses a HashMap to store the frequency of each element in the array.
 * It iterates through the array and checks if the complement (i.e., the negative of the current number)
 * is already present in the map. If it is, the value associated with the complement in the map is added to the count.
 * Finally, the function increments the frequency of the current number in the map.
 */
public class ZeroSumPairs {

    public static void main(String[] args) {
        int[] array = {2, -2, 3, 1, -1, 4, 0, -3};
        System.out.println("Number of zero-sum pairs: " + countZeroSumPairs(array));
    }

    public static int countZeroSumPairs(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : array) {
            int complement = -num;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}