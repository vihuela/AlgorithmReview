package com.example.leec.stack;//ʹ�ö���ʵ��ջ�����в�����
//
// 
// push(x) -- Ԫ�� x ��ջ 
// pop() -- �Ƴ�ջ��Ԫ�� 
// top() -- ��ȡջ��Ԫ�� 
// empty() -- ����ջ�Ƿ�Ϊ�� 
// 
//
// ע��: 
//
// 
// ��ֻ��ʹ�ö��еĻ�������-- Ҳ���� push to back, peek/pop from front, size, �� is empty ��Щ�����Ǻ�
//���ġ� 
// ����ʹ�õ�����Ҳ��֧�ֶ��С� �����ʹ�� list ���� deque��˫�˶��У���ģ��һ������ , ֻҪ�Ǳ�׼�Ķ��в������ɡ� 
// ����Լ������в���������Ч�ģ�����, ��һ���յ�ջ������� pop ���� top �������� 
// 
// Related Topics ջ ��� 
// ? 199 ? 0


import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

//leetcode submit region begin(Prohibit modification and deletion)
class MyStack {

    public static void main(String[] args) {
        MyStack m = new MyStack();
        m.push(1);
        m.push(2);
        System.out.println(m.top());
        System.out.println(m.top());
        System.out.println(m.empty());

    }

    LinkedList<Integer> q = new LinkedList<>();

    /**
     * Initialize your data structure here.
     */
    public MyStack() {

    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        q.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return q.removeLast();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return q.peekLast();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)
