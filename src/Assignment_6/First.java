package Assignment_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class First {
    public static void main(String[] args) {

        List<Integer> list= List.of(1,1,2,2,3,3,4,4);
        List <Integer> ans =list.stream().distinct().toList();
        System.out.println(ans);

        //using set
        Integer[] a = {1,1,2,2,3,3,4,4};
        Set<Integer> set = new HashSet<>(List.of(a));
        System.out.println(set);


    }
}
