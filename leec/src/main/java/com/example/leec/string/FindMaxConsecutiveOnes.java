package com.example.leec.string;


import java.util.HashMap;
import java.util.Map;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] ints = {1, 0, 0, 1, 1, 0, 1};
        int dd = findMaxConsecutiveOnes(ints);
        System.out.println(dd);
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int repeat = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                repeat++;
            } else {
                m.put(i, repeat);
                repeat = 0;
            }
        }

        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            repeat = Math.max(entry.getValue(), repeat);
        }

        return repeat;
    }


}