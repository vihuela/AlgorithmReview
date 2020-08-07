package com.example.leec.string;


public class FindMin {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{4, 5, 6, 7,  1, 2}));
    }

    public static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;

    }


}