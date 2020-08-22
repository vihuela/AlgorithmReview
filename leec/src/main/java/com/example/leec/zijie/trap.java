package com.example.leec.zijie;

public class trap {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int water = 0;
        int leftmax = 0;
        int rightmax = 0;
        while (left < right) {
            //确定左边的最高柱子
            leftmax = Math.max(leftmax, height[left]);
            //确定左边的最高柱子
            rightmax = Math.max(rightmax, height[right]);
            //那么桶的高度就是leftmax和rightmax中最小的那个
            if (leftmax < rightmax) {
                //桶的高度是leftmax
                System.out.println("leftmax:" + leftmax + " height[" + left + "] ： " + height[left]);
                water += (leftmax - height[left]);
                left++;
            } else {
                //桶的高度是rightmax
                water += (rightmax - height[right]);
                right--;
            }
        }
        return water;
    }

}
