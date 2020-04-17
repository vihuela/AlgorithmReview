package com.example.leec;

import com.example.leec.utils.PrintUtil;

public class sort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,3,0};
        PrintUtil.printArr(arr);
        bubbleSort3(arr,2);
        PrintUtil.printArr(arr);
    }

    public static void bubbleSort3(int[] a, int n) {
        int j, k;
        int flag = n;//flag来记录最后交换的位置，也就是排序的尾边界

        while (flag > 0) {//排序未结束标志
            k = flag; //k 来记录遍历的尾边界
            flag = 0;

            for (j = 1; j < k; j++) {
                if (a[j - 1] > a[j]) {//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;

                    //表示交换过数据;
                    flag = j;//记录最新的尾边界.
                }
            }
        }
    }
}
