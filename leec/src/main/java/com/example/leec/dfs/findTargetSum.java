package com.example.leec.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findTargetSum {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 1, 1};
        System.out.println((new Solution()).findTargetSumWays(arr, 3));
    }

    public static class Solution {
        int count = 0;

        public int findTargetSumWays(int[] nums, int S) {
            calculate(nums, 0, 0, S);
            return count;
        }

        public void calculate(int[] nums, int i, int sum, int S) {
            if (i == nums.length) {
                if (sum == S)
                    count++;
            } else {
                calculate(nums, i + 1, sum + nums[i], S);
                calculate(nums, i + 1, sum - nums[i], S);
            }
        }
    }

}
