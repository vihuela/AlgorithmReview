package com.example.leec.sort;

public class Quick {
    public static void quick(int[] a, int left,int right) {
        int i;
        int j;
        int t;
        int temp;
        if(left>right) return;
        //赋值基准数
        temp = a[left];
        i = left;
        j = right;

        while (i!=j){
            //左边
            while (a[i]<=temp && i<j){
                i++;
            }
            //右边
            while (a[j]>=temp && i<j){
                j--;
            }
            //交换
            if(j<j){
                t = a[i];
                a[i] =a[j];
                a[j] = t;
            }

            //重置基准数
//            a[left] = a[i]
        }
    }
}
