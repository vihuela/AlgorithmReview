package com.example.leec.stack;

import com.example.leec.utils.PrintUtil;

import java.util.Stack;

public class EveryTemperature {
    /**
     * 请根据每日 气温 列表，重新生成一个列表。对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
     * <p>
     * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
     * <p>
     * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
     *
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        PrintUtil.printArr(stackSolution(arr));
    }

    private static int[] forceSolution(int[] arr) {
        int[] res = new int[arr.length];
        for (int searchIndex = 0; searchIndex < arr.length; searchIndex++) {
            //每个元素都计算它对应的值，所有每个元素都遍历
            int diff = 0;
            int search = arr[searchIndex];
            //从所在数往后查找
            for (int i = searchIndex; i < arr.length; i++) {
                if (arr[i] == search) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] > arr[i]) {
                            diff = j - i;
                            break;
                        }
                    }
                    break;
                }
            }
            res[searchIndex] = diff;
            System.out.println(diff);
        }
        return res;
    }

    //https://leetcode-cn.com/problems/daily-temperatures/solution/java-by-sdwwld/
    public static int[] stackSolution(int[] T) {
        //保存上一个角标
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int idx = stack.pop();
                ret[idx] = i - idx;
            }
            stack.push(i);
        }
        return ret;
    }


}
