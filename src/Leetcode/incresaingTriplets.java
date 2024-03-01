package Leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class incresaingTriplets {
    public static void main(String[] args) {
        boolean valid = false;
//       int[] nums =  {20,100,10,12,5,13};
       int[] nums =  {2,1,5,0,4,6};
//       int[] nums =  {66,44,11,33,44,55,66};
       int i = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            map.put(nums[j],j);
        }
        List<Integer> values = map.keySet().stream().sorted().collect(Collectors.toList());
        System.out.println(values);
        System.out.println(map);
        for (int j = 0; j < nums.length-2; j++) {
            if(values.get(j)<values.get(j+1) && map.get(values.get(j))<map.get(values.get(j+1))) {
                System.out.println(map.get(values.get(j)) + ":" + map.get(values.get(j+1)));
                if (values.get(j + 1) < values.get(j + 2) && map.get(values.get(j + 1)) < map.get(values.get(j + 2))) {
                    System.out.println(map.get(values.get(j+1)) + ":" + map.get(values.get(j+2)));
                    valid = true;
                    break;
                }
//        System.out.println(map.keySet().stream().sorted().collect(Collectors.toList()));
            }
        }
        System.out.println(valid);
    }
}
