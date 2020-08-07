package com.example.leec.string;


public class ReverseWords2 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    /**
     * 输入: "Let's take LeetCode contest"
     * 输出: "s'teL ekat edoCteeL tsetnoc"
     *
     * @param s
     * @return
     */
    public static String reverseWords(String s) {
        String[] wordsArray = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < wordsArray.length; i++) {
            char[] item = wordsArray[i].toCharArray();
            int start = 0, end = item.length - 1;
            while (start < end) {
                char tmp = item[end];
                item[end] = item[start];
                item[start] = tmp;
                start++;
                end--;
            }
            if (i == wordsArray.length - 1)
                result.append(new String(item));
            else
                result.append(new String(item) + " ");
        }
        return result.toString();
    }


}