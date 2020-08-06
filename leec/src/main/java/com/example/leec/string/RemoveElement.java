package com.example.leec.string;


import com.example.leec.utils.PrintUtil;

public class RemoveElement {
    public static void main(String[] args) {
        int[] ints = {3, 2, 2, 3};
        int dd = removeElement(ints, 3);
        System.out.println();
    }


    public static int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        for (; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }


}