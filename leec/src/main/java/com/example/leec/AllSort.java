package com.example.leec;

/**
 * 数组全排列
 *
 * 思路: 分治思想，遍历数据，拿第一个数，将其与数组最后一个元素交换，其余 n-1 个进行全排，然后再复位再进行下一位的处理，以此类推
 */
public class AllSort {

    /**
     * 打印数组全排列
     *
     * @param data      原数据
     * @param arrLength 数组长度
     * @param subArrLength 数组需要进行排列的元素个数
     */
    public void printPermutations(int[] data, int arrLength, int subArrLength) {
        if (subArrLength == 1) {
            for (int i = 0; i < arrLength; ++i) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < subArrLength; ++i) {
            int temp = data[i];
            data[i] = data[subArrLength - 1];
            data[subArrLength - 1] = temp;

            printPermutations(data, arrLength, subArrLength - 1);

            temp = data[i];
            data[i] = data[subArrLength - 1];
            data[subArrLength - 1] = temp;
        }
    }

    public static void main(String[] args) {
        AllSort solution = new AllSort();
        int[] arr = new int[] {1, 2, 3};
        solution.printPermutations(arr, arr.length, arr.length);
    }
}
