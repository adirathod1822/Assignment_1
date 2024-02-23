package Assignment_8.Fourth;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FourthEight {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,6,3,4,2,7);
        System.out.println("List: " +  l.stream().distinct().toList());
        System.out.println("count: " +  l.stream().distinct().count());
        System.out.println("Max: " +  l.stream().distinct().max(Integer::compareTo).stream().toList().get(0));
        System.out.println("Min: " +  l.stream().distinct().min(Integer::compareTo).stream().toList().get(0));
        System.out.println("Sum: " +  l.stream().distinct().mapToInt(Integer::intValue).sum());
        System.out.println("Average: " +  l.stream().distinct().mapToInt(Integer::intValue).average().getAsDouble());
    }
}
