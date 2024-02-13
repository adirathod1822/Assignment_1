package Leetcode;

import java.util.*;

public class isPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        char[] chArr = s.toCharArray();
//        StringBuilder str = new StringBuilder();
//        StringBuilder rev = new StringBuilder();
        String str = "";
        String rev = "";

        char a = 'a';
        System.out.println((char) ('A' + 32));
        for (int i = 0; i < chArr.length; i++) {
            if ((chArr[i] >= 97 && chArr[i] <= 122) || (chArr[i] >= 65 && chArr[i] <= 90)|| (chArr[i] >= 48 && chArr[i] <= 57)) {
                if (chArr[i] >= 65 && chArr[i] <= 90) a = (char) (chArr[i] + 32);
                else a = chArr[i];
                str+=a;
            }
        }
        for (int i = chArr.length - 1; i >= 0; i--) {
            if ((chArr[i] >= 97 && chArr[i] <= 122) || (chArr[i] >= 65 && chArr[i] <= 90)|| (chArr[i] >= 48 && chArr[i] <= 57)) {
                if (chArr[i] >= 65 && chArr[i] <= 90) a = (char) (chArr[i] + 32);
                else a = chArr[i];
                rev+=a;
            }
        }
            System.out.println(str.equals(rev));
            System.out.println(str);
        System.out.println(rev);
        }
    }

