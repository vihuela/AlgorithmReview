package com.example.leec.string;


public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] ints = {1,0,0,1,1,0,1};
        int dd = findMaxConsecutiveOnes(ints);
        System.out.println(dd);
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        int repeat = 0;
        for (int i=0; i < nums.length; i++) {
            if(nums[i] == 1){
                repeat++;
            }
            else{
                repeat = 0;
            }
        }
        return repeat;
    }


}