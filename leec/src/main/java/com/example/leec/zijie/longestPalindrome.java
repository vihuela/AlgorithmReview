package com.example.leec.zijie;

public class longestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abbadd"));
    }

    public static String longestPalindrome(String s) {
        int len = s.length();
        int max = 0;
        String res="";
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String tmp = s.substring(i, j);
                if (isPalindrome(tmp) && tmp.length() > max) {
                    res = s.substring(i, j);
                    max = Math.max(max, res.length());
                }

            }
        }
        return res.toString();
    }

    public static boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
