package com.example.leec.string;


import com.example.leec.utils.PrintUtil;

public class TwoSum {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{1,2,3,4,4,9,56,90}, 8);
        PrintUtil.printArr(ints);
    }

    /**
     * ����: numbers = [2, 7, 11, 15], target = 9
     * ���: [1,2]
     * ����: 2 �� 7 ֮�͵���Ŀ���� 9 ����� index1 = 1, index2 = 2 ��
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target && i<j) {
                    return new int[]{i+1,j+1};
                }

            }
        }
        return numbers;
    }


}