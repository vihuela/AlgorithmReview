package com.example.leec.queue;

import java.util.List;

public class TruntableLock {
    public static void main(String[] args) {
        String[] deadArr = {"0201", "0101", "0102", "1212", "2002"};
        check(deadArr, "1111");
    }

    public static int check(String[] deadArr, String target) {
        for (String item : deadArr) {
            //0201
            char[] chars = item.toCharArray();
            for (int c = 0; c < chars.length; c++) {
                //0,2,0,1
                int cInt = Character.getNumericValue(chars[c]);

                System.out.println(cInt);
            }
        }
        return -1;
    }

}

