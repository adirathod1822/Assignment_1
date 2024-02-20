package Leetcode;

import java.util.*;

public class productExceptItself {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for(int i=1; i<nums.length; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int temp = 1;
        for (int j=nums.length-1 ; j >=0 ; j--) {
            ans[j] *= temp;
            temp *= nums[j];
        }
        System.out.println(Arrays.toString(ans));



//        for (int i = 0; i < nums.length; i++) {
//            int temp = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if (i == j) continue;
//                else {
//                    temp *= nums[j];
//                }
//            }
//            ans[i] = temp;
//        }
            System.out.println(Arrays.toString(ans));


//        HashMap<Integer, List<Integer>> map = new HashMap<>();
//        List<Integer> l = new ArrayList<>(List.of(nums));
//        for(int i=0; i<4; i++) {
//            map.put(nums[i], l.stream().toList());
//            map.get(nums[i]).get(i).remove(nums[i]);
//        }
////        for(int i=0; i<4; i++) {
////            map.put(nums[i],map.keySet().stream().toList());
//////            map.get(nums[i]).remove(map.get(nums[i]));
////        }
//        System.out.println(map);
//        System.out.println(map.keySet().stream().toList().remove(map.get(nums[i])));
//        map.keySet().stream().iterator().forEachRemaining(key -> System.out.println((key-1)*key));
    }
}
