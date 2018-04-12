package com.nice.piyush.data.structures.arrays;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Stack;

public class ArrayProblems {
    /**
     * Kadane's Algorithm.
     *
     * @param a
     * @param n
     * @return
     */
    public int maxSubarraySum(int[] a, int n) {
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < n; i++) {
            curr_max = Math.max(a[i], curr_max + a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }

        System.out.print("\n\n");
        return max_so_far;
    }

    /**
     * Checks the string for balanced parenthesis.
     *
     * @param s
     * @return
     */
    public boolean isStringWithBalancedParantheses(String s) {
        if(s == null || s.isEmpty()){
            return false;
        }

        final Map<Character, Character> openingToClosing = Maps.newHashMap();
        final Stack<Character> stack = new Stack();

        openingToClosing.put(')', '(');
        openingToClosing.put('}', '{');
        openingToClosing.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('
                    || s.charAt(i) == '{'
                    || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                final Character brace = openingToClosing.get(s.charAt(i));

                if (brace != null) {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    final Character c = stack.pop();

                    if (c != brace) {
                        return false;
                    }
                }

            }
        }

        return stack.isEmpty() ? true : false;
    }
}
