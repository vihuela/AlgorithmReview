package com.example.leec.string;


public class StrStr {
    public static void main(String[] args) {
        System.out.println(strStr1("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();

        int i = n - L + 1;//滑动的次数
        for (int start = 0; start < i; ++start) {
            int i1 = start + L;//移动每一次的索引
            if (haystack.substring(start, i1).equals(needle)) {
                return start;
            }
        }
        return -1;
    }

    public static int strStr1(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        int moveCount = len1 - len2 + 1;
        for (int i = 0; i < moveCount; i++) {
            int index = i + len2;
            if (haystack.substring(i, index).equals(needle))
                return i;
        }
        return -1;
    }

}