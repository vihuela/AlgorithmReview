package com.example.leec.stack;



import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class MyQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());;  // 返回 1
        System.out.println(queue.pop());;   // 返回 1
        System.out.println(queue.empty());; // 返回 false

    }

    public Stack<Integer> s1 = new Stack<Integer>();
    public Stack<Integer> s2 = new Stack<Integer>();
    /** Initialize your data structure here. */
    public MyQueue() {
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!s2.empty()){
            s1.push(s2.pop());
        }
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!s1.empty()){
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    /** Get the front element. */
    public int peek() {
        while (!s1.empty()){
            s2.push(s1.pop());
        }
        return s2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        return s2.empty();
    }


}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)
