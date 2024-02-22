package Assignment_8.Fourth;

import java.util.*;
import java.util.stream.Collectors;

public class FourthSeven {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,6,3,4,2,7);
        l = l.stream().distinct().map(x->x*x).collect(Collectors.toList());
        System.out.println(l);
    }
}
