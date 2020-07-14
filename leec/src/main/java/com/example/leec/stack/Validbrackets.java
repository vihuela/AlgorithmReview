package com.example.leec.stack;

import java.util.Stack;

public class Validbrackets {
    public static void main(String[] args) {
        System.out.println(isValid("{}"));
    }

    static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> cur = new Stack<>();
        for (char c : chars) {
            if (cur.isEmpty()) {
                cur.push(c);
                continue;
            }
            char top = cur.peek();

            if (c == '}' && top == '{'
                    || c == ']' && top == '['
                    || c == ')' && top == '(') {
                cur.pop();
            } else {
                cur.push(c);
            }
        }
        return cur.isEmpty();
    }
}