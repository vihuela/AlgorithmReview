package com.example.leec.array;

import com.example.leec.utils.PrintUtil;

import java.util.Arrays;
import java.util.HashMap;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 18}, {2, 0}, {1, 3}, {8, 10}};
        PrintUtil.printArr(arr);
        setZeroes(arr);
        PrintUtil.printArr(arr);
    }

    public static void setZeroes(int[][] matrix) {


        boolean[] rowFlag = new boolean[matrix.length];
        boolean[] colFlag = new boolean[matrix[0].length];

        Arrays.fill(rowFlag, false);
        Arrays.fill(colFlag, false);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    rowFlag[row] = true;
                    colFlag[col] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rowFlag[i] || colFlag[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
