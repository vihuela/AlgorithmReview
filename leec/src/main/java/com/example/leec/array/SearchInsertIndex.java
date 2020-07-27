package com.example.leec.array;


import java.util.ArrayList;

public class SearchInsertIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(arr, 8));
    }

    public static int searchInsert(int[] nums, int target) {
        int findIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target > nums[i]) {
                findIndex = i + 1;
            }
        }
        return findIndex;
    }
}