package Leetcode;

import java.util.*;
import java.util.HashMap;

public class GroupAnagram {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        System.out.println(list);
        HashMap<Character, List<String>> maps = new HashMap<>();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        int i = 0;
        int j = 0;
        while (i != strs.length ) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            i++;
            while (j != strs.length ) {
                List<String> st = new ArrayList<>();
                char[] arr2 = strs[j].toCharArray();
                Arrays.sort(arr2);
//              System.out.println("arr1: "+ Arrays.toString(arr) + "arr2: "+ Arrays.toString(arr2));
                if (Arrays.equals(arr, arr2)) {
                    System.out.println(strs[i] + " " + strs[j]);
                    if(!st.contains(strs[j])){
                        st.add(strs[j]);
//                        System.out.println(st);
                    }
                }
                else System.out.println(strs[i]);
                j++;
                System.out.println(st);
            }
            j = i + 1;
        }

    }}

