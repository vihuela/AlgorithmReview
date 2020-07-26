package com.example.leec.dfs;

import com.example.leec.utils.PrintUtil;

public class ZeroOneMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};

        int[][] res = floodFill(arr);
        PrintUtil.printArr(res);
    }

    public static int[][] floodFill(int[][] image) {
        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[0].length; col++) {
                if (image[row][col] != 0) {
                    int count = 1;
                    image[row][col] = findTBLR(image, row, col, count);
                }
            }
        }
        return image;
    }

    private static int findTBLR(int[][] image, int row, int col, int count) {
        if (row >= image.length || col >= image[0].length || row < 0 || col < 0) {
            return count;
        }
        int t = findTBLR(image, row - 1, col, count);
        int b = findTBLR(image, row + 1, col, count);
        int l = findTBLR(image, row, col - 1, count);
        int r = findTBLR(image, row, col + 1, count);
        if (t == 0 || b == 0 || l == 0 || r == 0) {

        }
        return count;
    }
}
