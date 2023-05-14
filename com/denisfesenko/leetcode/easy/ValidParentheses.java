package com.denisfesenko.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 20. Valid Parentheses
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}")); //true
        System.out.println(isValid("()")); //true
        System.out.println(isValid("(]")); //false
        System.out.println(isValid("([)]")); //false
        System.out.println(isValid("{[]}")); //true
        System.out.println(isValid("[")); //false
        System.out.println(isValid("((")); //false
        System.out.println(isValid("(){}}{")); //false
        System.out.println(isValid("))")); //false
    }

    public static boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }

        Map<Character, Character> characterMap = new HashMap<>();
        characterMap.put('(', ')');
        characterMap.put('{', '}');
        characterMap.put('[', ']');

        Deque<Character> deque = new ArrayDeque<>();

        for (Character c : s.toCharArray()) {
            if (characterMap.containsKey(c)) {
                deque.add(c);
            } else if (deque.isEmpty() || !Objects.equals(c, characterMap.get(deque.pollLast()))) {
                return false;
            }
        }
        return deque.isEmpty();
    }
}
