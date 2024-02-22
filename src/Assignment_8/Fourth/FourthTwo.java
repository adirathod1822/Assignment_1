package Assignment_8.Fourth;

import java.util.Arrays;
import java.util.List;

public class FourthTwo {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("asdfg","sdf","qwer","qwerty","zx");
        long count = str.stream().filter(s -> s.length()>3).count();
        System.out.println(count);
    }
}
