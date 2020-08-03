package com.example.leec.string;


public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("fbbf"));
    }

    public static String longestPalindrome(String s) {

        int maxLen = 0;
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String check = s.substring(i, j);
                if (isPalindromic(check) && check.length() > maxLen) {
                    res = s.substring(i, j);
                    maxLen = Math.max(maxLen, res.length());
                }
            }
        }
        return res;
    }

    public static boolean isPalindromic(String s) {
        //abba
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}