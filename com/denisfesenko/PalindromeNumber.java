package com.denisfesenko;

/**
 * 9. Palindrome Number
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome1(12345321));
        System.out.println(isPalindrome2(12345321));
    }

    public static boolean isPalindrome1(int x) {
        String num = String.valueOf(x);
        StringBuilder leftPart = new StringBuilder();
        StringBuilder rightPart = new StringBuilder();
        int halfLength = num.length() / 2;
        for (int i = 0; i < halfLength; i++) {
            leftPart.append(num.charAt(i));
            rightPart.append(num.charAt(num.length() - i - 1));
        }
        return leftPart.toString().equals(rightPart.toString());
    }

    public static boolean isPalindrome2(int x) {
        // Special cases:
        // If the number is negative or ends with a zero (except for zero itself),
        // it cannot be a palindrome.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // When the length of the number is odd, we can get rid of the middle digit
        // by dividing the reversed number by 10.
        // For example, if the input is 12321, after the loop, we have reversed = 123 and x = 12.
        // By dividing the reversed number by 10, we get rid of the middle digit.
        return x == reversed || x == reversed / 10;
    }
}
