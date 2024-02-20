package Leetcode;

import java.util.*;

public class longConsSeq {
    public static void main(String[] args) {
        int[]  nums = {100,4,200,1,1,1,1,3,2};
        System.out.println(Arrays.toString(nums));
        ArrayList <Integer> l = new ArrayList<>();
        int count = 0;
        for(int i:nums) l.add(i);
//        l.sort(Collections.reverseOrder());
        List<Integer> distList = l.stream().distinct().toList();
        Collections.sort(distList);
        System.out.println(l);
//        l.clear();
//        for (int i=0; i<distList.size()-1; i++){
//            if(distList.get(i+1)- distList.get(i)==1) count+=1;
//            else {
//                l.add(count+=1);
//                count =0;
//            }
//        }
//        l.add(count+=1);
////        System.out.println(distList);
////
//        System.out.println(l.stream().max(Integer::compareTo).get());
    }
}

