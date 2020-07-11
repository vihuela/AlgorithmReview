package com.example.leec.queue;

//https://leetcode-cn.com/explore/learn/card/queue-stack/216/queue-first-in-first-out-data-structure/864/
class MyCircularQueue {


    private int datas[];
    private int head = -1;
    private int tail = -1;
    private int size = 0;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        size = k;
        datas = new int[k];
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            head = 0;
        }

        tail = (tail + 1) % size;
        datas[tail] = value;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        datas[head] = 0;
        head = (head + 1) % size;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return datas[head];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return datas[tail];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return head == -1;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }
}

class Test {
    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        System.out.println("res:" + circularQueue.enQueue(1));// 返回 true
        System.out.println("res:" + circularQueue.enQueue(2));// 返回 true
        System.out.println("res:" + circularQueue.enQueue(3));// 返回 true
        System.out.println("res:" + circularQueue.enQueue(4));// 返回 false
        System.out.println("res:" + circularQueue.Rear());// 返回 3
        System.out.println("res:" + circularQueue.isFull());// 返回 true
        System.out.println("res:" + circularQueue.deQueue());// 返回 true
        System.out.println("res:" + circularQueue.enQueue(4));// 返回 true
        System.out.println("res:" + circularQueue.Rear());// 返回 4
        System.out.println();
    }
}