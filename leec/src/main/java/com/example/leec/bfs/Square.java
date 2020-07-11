package com.example.leec.bfs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode-cn.com/problems/perfect-squares/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by--51/
public class Square {

    //给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）
    // 使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。

    public static void main(String[] args) {
        System.out.println(numSquares3(12));

    }

    //经典解法
    //12=1+11...不断拆解，求最短路径
    //12=4+8
    //12=9+3
    static HashMap<Integer, Integer> m = new HashMap<>();

    public static int numSquares(int n) {
        if (n == 0) return 0;
        if (m.get(n) != null) return m.get(n);
        int count = Integer.MAX_VALUE;
        //1 4 9 16...
        for (int i = 1; i * i <= n; i++) {
            count = Math.min(count, numSquares(n - i * i) + 1);
        }
        m.put(n, count);
        return count;
    }

    //动态规划
    public static int numSquares2(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        //依次求出 1, 2... 直到 n 的解
        for (int i = 1; i <= n; i++) {
            //依次减去一个平方数
            for (int j = 1; j * j <= i; j++) {
                int i1 = i - j * j;
                dp[i] = Math.min(dp[i], dp[i1] + 1);
            }
        }
        return dp[n];
    }

    //BFS
    public static int numSquares3(int n) {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int level = 0;
        queue.add(n);
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++; // 开始生成下一层
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                //依次减 1, 4, 9... 生成下一层的节点
                for (int j = 1; j * j <= cur; j++) {
                    int next = cur - j * j;
                    if (next == 0) {
                        return level;
                    }
                    if (!visited.contains(next)) {
                        queue.offer(next);
                        visited.add(next);
                    }
                }
            }
        }
        return -1;
    }


}
