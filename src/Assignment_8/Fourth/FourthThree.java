package Assignment_8.Fourth;

import java.util.Arrays;
import java.util.List;

public class FourthThree {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("asd","sdf","a","qwe","sad");
        long count = str.stream().filter(s -> s.matches("a[a-z]*")).count();
        System.out.println(count);
    }
}
