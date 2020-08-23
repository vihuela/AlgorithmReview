package com.example.leec.sort;

import com.example.leec.utils.PrintUtil;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,3,0};
        PrintUtil.printArr(arr);
        bubbleSort3(arr,2);
        PrintUtil.printArr(arr);
    }

    public static void bubbleSort3(int[] a, int n) {
        int i, j;

        for(i=0; i<n; i++){//表示n次排序过程。
            for(j=1; j<n-i; j++){
                if(a[j-1] > a[j]){//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]=temp;
                }
            }
        }
    }
}
