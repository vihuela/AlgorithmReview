package com.example.leec.stack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class BolanExpress {
    public static void main(String[] args) {
        String[] deadArr = {"4","3","-"};
        System.out.println(evalRPN(deadArr));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                stack.push(-stack.pop() + stack.pop());
            } else if (s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (s.equals("/")) {
                int num1 = stack.pop();
                stack.push(stack.pop() / num1);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    private static boolean isNum(String d) {
        try {
            Integer.parseInt(d);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

