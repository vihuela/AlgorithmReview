package com.example.leec.dfs;

public class IslandCount {
    public static void main(String[] args) {
        char[][] arr = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        System.out.println(numIslands(arr));
    }

    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int row = 0; row < grid.length; row++)//行
        {
            for (int col = 0; col < grid[0].length; col++)//列
            {
                if (grid[row][col] == '1') {
                    dfs(grid, row, col);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(char[][] grid, int row, int col) {
        //越界判断
        if (row >= grid.length || col >= grid[0].length || row < 0 || col < 0 || grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0';
        //上
        dfs(grid, row - 1, col);
        //下
        dfs(grid, row + 1, col);
        //左
        dfs(grid, row, col - 1);
        //右
        dfs(grid, row, col + 1);
    }
}

