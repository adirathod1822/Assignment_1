package Leetcode;

import java.util.*;

public class longCommPrefix {
    public static void main(String[] args) {
        String[] str = {"dog","racecar","car"};
//        System.out.println(str.length);
        List<Character> l = new ArrayList<>();
        for(int i=0; i< str.length;i++) {
            if(i<2){
                int len = str[i].toCharArray().length >= str[i+1].toCharArray().length ? str[i+1].toCharArray().length : str[i].toCharArray().length;
                for (int j = 0; j < len; j++) {
                    if (str[i].toCharArray()[j] == str[i + 1].toCharArray()[j]) {
                            System.out.println(str[i].toCharArray()[j]);
                        l.add(str[i].toCharArray()[j]);
                    }
                }
            }
            else {
                int len = str[i].toCharArray().length >= l.size() ? l.size() : str[i].toCharArray().length;
                for (int j = 0; j < len; j++) {
                    if (!l.contains(str[i].toCharArray()[j])) {
                        System.out.println(str[i].toCharArray()[j]);
                    }
                    else l.remove(i);
                }
            }
        }
    }
}
