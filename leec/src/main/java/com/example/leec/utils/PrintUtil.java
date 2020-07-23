package com.example.leec.utils;

import java.util.Map;

public class PrintUtil {


    public static void printArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("------");
    }

    public static void printArr(int[][] arr) {
        for (int[] value : arr) {
            for (int v : value)
                System.out.print(v + " ");
            System.out.println("------");
        }
        System.out.println("------");
    }

    public static void printMap(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("------");
    }
}
