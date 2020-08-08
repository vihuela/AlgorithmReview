package com.example.leec.double_point;


import com.example.leec.utils.PrintUtil;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1, 1,0, 2};
        moveZeroes(nums);
        PrintUtil.printArr(nums);
    }

    public static void moveZeroes(int[] nums) {
        int head = 0;
        for(int tail = 0; tail < nums.length; ++tail){
            if(nums[tail] != 0){
                int num = nums[head];
                nums[head] = nums[tail];
                nums[tail] = num;
                head++;
            }
        }
    }
}