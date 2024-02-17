package Leetcode;

import java.util.Stack;

public class dailyTemp {
    public static void main(String[] args) {
        int[] tempreatures = {73,74,75,71,69,72,76,73};
        Stack<Integer> ans = new Stack<>();
        int count = 1;
        int i = 0;
        while(tempreatures.length-1!=0){
            if(tempreatures[i]>tempreatures[i+1]) {
                count += 1;
            }
            else{
                ans.push(count);
                count = 1;
            }
        }
        System.out.println(ans);
    }
}
