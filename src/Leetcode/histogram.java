package Leetcode;
import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class histogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < heights.length-1; i++) {
            if(st.empty()) st.push(heights[i]);
        }
        System.out.println(st);
    }

}

//public static void main(String[] args) {
//    int[] heights = {2,1,5,6,2,3};
////        System.out.println(heights.length);
////        int[] max = new int[heights.length-1];
//    int max = 0;
//    int prev = 0;
//    int count = 1;
//    for (int i = 0; i < heights.length; i++) {
//        if(heights[i]>heights[max]) {
//            max = i;
//        }
//        if((heights[i]<heights[max] && heights[prev]<heights[i] )&& heights.length>1) {
//            prev = i;
//            System.out.println(heights[i]);
//            count+=1;
//        }
//
//    }
//    System.out.println(heights[max]);
//    System.out.println(count);
//    System.out.println(heights[prev]*count);
//}
