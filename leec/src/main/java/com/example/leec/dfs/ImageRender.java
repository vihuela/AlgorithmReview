package com.example.leec.dfs;

import com.example.leec.utils.PrintUtil;

public class ImageRender {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] res = floodFill(arr, 1, 1, 2);
        PrintUtil.printArr(res);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[0].length; col++) {
                if (image[row][col] != 0) {
                    findIndex(image, row, col, newColor);
                }
            }
        }
        return image;
    }

    private static void findIndex(int[][] image, int row, int col, int newColor) {
        if (row >= image.length || col >= image[0].length || row < 0 || col < 0 || image[row][col] == 0) {
            return;
        }
        image[row][col] = newColor;
        findIndex(image, row + 1, col, newColor);
        findIndex(image, row, col + 1, newColor);
    }
}
