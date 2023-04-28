package com.denisfesenko;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Give 2 arrays, create a function that lets a user know (true/false) whether these two arrays contain any common items
 * For Example:
 * const array1 ['a', 'b', 'c', 'x'];
 * const array2= ['z', 'y', 'i'];
 * should return false.
 */
public class CommonItems {

    public static void main(String[] args) {
        String[] array1 = {"a", "b", "c", "x"};
        String[] array2 = {"z", "y", "i"};

        System.out.println(hasCommonItems(array1, array2)); // Output: false
    }

    public static boolean hasCommonItems(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>();

        // Add elements of array1 to the set
        Collections.addAll(set1, array1);

        // Check if any element of array2 is present in the set
        for (String item : array2) {
            if (set1.contains(item)) {
                return true;
            }
        }

        return false;
    }
}
