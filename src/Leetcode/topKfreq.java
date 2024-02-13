package Leetcode;

import java.util.*;

public class topKfreq {
    public static void main(String[] args) {
        int k = 2;
        int o = 0;
        int[] arr = {1,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        int  count = 0;
        int[] ans = new int[k];
        int i=0;
        int j=0;
        while(i != arr.length){
            if(arr[i] == arr[j++]) {
                map.put(arr[i],count+=1);
            }
            if(j==arr.length){
                j=0;
                i++;
                count = 0;
            }
        }
        System.out.println("Map  "+map.clone());
        while(o!=k){
            int max = 0;
            int maxIndex = 1;
            for(int m: map.keySet()){
                if(map.get(m) > max) {
                    max = map.get(m);
                    maxIndex = m;
                }
            }
            System.out.println(map);
            map.remove(maxIndex);
            ans[o] = maxIndex;
            max = 0;
            o++;
        }
        System.out.println(Arrays.toString(ans));

//        System.out.println("runner  "+runner);
//        System.out.println("runI  "+runnerIndex);
    }
}
