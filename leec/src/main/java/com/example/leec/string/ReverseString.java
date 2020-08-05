package com.example.leec.string;


public class ReverseString {
    public static void main(String[] args) {
        ReverseString("hello".toCharArray());
    }

    public static void ReverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char tmp = s[end];
            s[end] = s[start];
            s[start] = tmp;
            start++;
            end--;
        }
        System.out.println(new String(s));
    }


}