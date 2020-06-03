package com.example.leec;

import java.util.HashMap;

import static com.example.leec.utils.PrintUtil.printArr;

public class twosum {

//    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//            Example:
//
//    Given nums = [2, 7, 11, 15], target = 9,
//
//    Because nums[0] + nums[1] = 2 + 7 = 9,
//            return [0, 1].

    public static void main(String[] args) {
        int[] arr = new int[]{2, 12121, 11, 7};
        printArr(twoSum(arr, 9));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (map.containsKey(dif)) {
                return new int[]{map.get(dif), i};
            }
            map.put(nums[i], i);
        }
//
        return nums;
    }
}
