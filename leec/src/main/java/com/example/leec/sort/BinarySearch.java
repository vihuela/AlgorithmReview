package com.example.leec.sort;

public class BinarySearch {
    public static int recursionBinarySearch(int[] arr, int key, int low, int high) {
        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] > key) {
            return recursionBinarySearch(arr, key, low, mid - 1);
        } else if (arr[mid] < key) {
            return recursionBinarySearch(arr, key, mid + 1, high);
        } else {
            return mid;
        }
    }
}
