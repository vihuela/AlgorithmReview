package com.example.leec.string;


public class ReverseWords {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        String[] wordsArray = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = wordsArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                result.append(wordsArray[i]);
            } else {
                result.append(wordsArray[i] + " ");
            }

        }
        return result.toString();
    }

}