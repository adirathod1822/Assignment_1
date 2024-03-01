package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class compressString {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        String s  = "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char a : chars) {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        System.out.println(map);
        for(char a : map.keySet()){
            s+=(char)a;
            if(map.get(a)>1)s+=map.get(a);
        }
        System.out.println(s);
        for(int i=0; i<s.length(); i++){

            chars[i] = s.toCharArray()[i];
        }
        System.out.println(Arrays.toString(chars));
    }
}
