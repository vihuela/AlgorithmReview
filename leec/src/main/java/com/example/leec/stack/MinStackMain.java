package com.example.leec.stack;

import java.util.Stack;

public class MinStackMain {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        ;   //--> 返回 -3.
        minStack.pop();
        System.out.println(minStack.top());
        ;      //--> 返回 0.
        System.out.println(minStack.getMin());
        ;   //--> 返回 -2.
        minStack.push(-4);
        System.out.println(minStack.getMin());

    }

    static class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> min_stack;
        public MinStack() {
            stack = new Stack<>();
            min_stack = new Stack<>();
        }
        public void push(int x) {
            stack.push(x);
            //确保最小栈栈顶元素最小
            if(min_stack.isEmpty() || x <= min_stack.peek())
                min_stack.push(x);
        }
        public void pop() {
            //移除同步
            if(stack.pop().equals(min_stack.peek()))
                min_stack.pop();
        }
        public int top() {
            return stack.peek();
        }
        public int getMin() {
            return min_stack.peek();
        }
    }

}
