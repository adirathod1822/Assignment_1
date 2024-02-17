package Leetcode;

import java.util.*;

public class generateParantheses {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>() ;
        List<String> l = new ArrayList<>();
        List<Integer> list = Arrays.asList(-1,0, 25, 4);
        System.out.println(list.stream().min(Integer::compare).get());

//        int n = 3;
//        for (int i = 0; i < n; i++) {
//            st.push('a');
//        }
//        System.out.println();
    }
}
