package com.denisfesenko;

/**
 * Reverse a String
 * Write a Java function that takes a string as input and returns the string reversed.
 **/
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseStringOne("12345"));
        System.out.println(reverseStringTwo("12345"));
    }

    public static String reverseStringOne(String input) {
        var length = input.length();
        var result = new char[length];
        for (var i = 0; i < length; i++) {
            result[i] = input.toCharArray()[length - (i + 1)];
        }
        return new String(result);
    }

    /**
     * In this solution, we first check if the input is null or if its length is less than or equal to 1.
     * If either condition is true, we return the input. Then, we create a character array from the input string
     * and use two pointers, one at the beginning (left) and one at the end (right). We swap the characters at these
     * positions, increment the left pointer, and decrement the right pointer until the pointers meet or cross each other.
     * This alternative solution also has an O(n) time complexity, where n is the length of the input string. Both your
     * original solution and this alternative are efficient solutions for reversing a string in Java.
     * The choice between them depends on your preference for readability and style.
     **/
    public static String reverseStringTwo(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }

        char[] result = input.toCharArray();
        int left = 0;
        int right = result.length - 1;

        while (left < right) {
            char temp = result[left];
            result[left] = result[right];
            result[right] = temp;
            left++;
            right--;
        }

        return new String(result);
    }
}
