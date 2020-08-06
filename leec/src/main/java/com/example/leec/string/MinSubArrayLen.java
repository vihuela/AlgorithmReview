package com.example.leec.string;


import java.util.HashMap;
import java.util.Map;

public class MinSubArrayLen {
    public static void main(String[] args) {
        int[] ints = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen2(7, ints));
    }


    public static int minSubArrayLen(int s, int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if (sum >= s)
                return 1;
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= s) {
                    min = Math.min(min, j - i + 1);
                    break;
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static int minSubArrayLen2(int s, int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            sum += nums[i];
            if (sum >= s) {
                return 1;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= s) {
                    min = Math.min(min, j - i + 1);
                    break;
                }

            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}