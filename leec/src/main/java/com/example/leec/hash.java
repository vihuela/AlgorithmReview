package com.example.leec;

import com.example.leec.utils.PrintUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class hash {

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
        int[] arr = new int[]{2, 7, 11, 15};
        twoSum(arr, 9);
    }

    public static void twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> m2 = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < arr.length; i++) {

            int diff = target - arr[i];
            m2.put(i, diff);
            if (arr[i] == diff) {
                res[0] = i;

            }
        }

        PrintUtil.printMap(m2);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target - m2.get(i)) {

            }
        }
    }
}
