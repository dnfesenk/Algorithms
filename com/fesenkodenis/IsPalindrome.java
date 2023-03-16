package com.fesenkodenis;

/***
 * Check if a number is a palindrome
 * Write a Java function that takes an integer as input and returns true if the number is a palindrome,
 * otherwise returns false.
 * */
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeOne(12131211));
        System.out.println(isPalindromeTwo(12131211));
    }

    /**
     * This implementation converts the integer to a string, calculates the half-length, and compares the first half
     * with the reversed second half. This solution is efficient in terms of readability and is relatively fast for
     * reasonably sized integer values. However, it might not be the most efficient solution in terms of performance
     * for very large integer values, as it requires converting the integer to a string and creating a StringBuilder
     * object. A more efficient approach could involve directly comparing the digits of the integer without the need
     * for a string conversion, though it might be less intuitive to implement.
     */
    public static boolean isPalindromeOne(int number) {
        var s = String.valueOf(number);
        var halfLength = s.length() / 2;
        var first = s.substring(0, halfLength);
        var last = new StringBuilder(s.substring(s.length() - halfLength)).reverse().toString();
        return first.equals(last);
    }

    /**
     * This implementation avoids string conversion and additional objects, making it more efficient in terms of performance.
     * The function first checks if the number is negative; if it is, it returns false. Then, it iterates through the
     * digits of the number, reversing them in the process. Finally, it compares the reversed number with the
     * original number to determine whether it's a palindrome.
     */
    public static boolean isPalindromeTwo(int number) {
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
