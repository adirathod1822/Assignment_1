package Assignment_6;
import Leetcode.BinarySearch;

import java.util.*;
public class Second {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<5; i++) list.add(rand.nextInt(100));
        System.out.println("Marks: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("The winner is with marks :- "+list.get(0)+"\nThe runners up with marks :- "+list.get(1));

    }
}
