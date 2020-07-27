package com.example.leec.array;


import com.example.leec.utils.PrintUtil;

import java.util.Arrays;
import java.util.Comparator;

public class CombinInterval {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{15, 18}, {2, 6}, {1, 3}, {8, 10}};
        PrintUtil.printArr(merge(arr));
    }

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {
                return t1[0] - t2[0];
            }
        });
        int[][] res = new int[intervals.length][2];
        int row = -1;
        for (int[] item : intervals) {
            if (row == -1 || item[0] > intervals[row][1]) {
                res[++row] = item;
            } else {
                res[row][1] = Math.max(res[row][1], item[1]);
            }
        }
        return Arrays.copyOf(res, row + 1);
    }
}