package com.example.leec.dfs;

import com.example.leec.utils.PrintUtil;

public class ImageRender {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

        int[][] res = floodFill(arr, 1, 1, 2);
        PrintUtil.printArr(res);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) {
            findIndex(image, sr, sc, color, newColor);
        }
        return image;
    }

    private static void findIndex(int[][] image, int row, int col, int color, int newColor) {
        if (row >= image.length || col >= image[0].length || row < 0 || col < 0 ) {
            return;
        }
        if (image[row][col] == color) {
            image[row][col] = newColor;
            findIndex(image, row + 1, col, color, newColor);
            findIndex(image, row - 1, col, color, newColor);
            findIndex(image, row, col + 1, color, newColor);
            findIndex(image, row, col - 1, color, newColor);
        }
    }
}
