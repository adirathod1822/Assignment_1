package Assignment_8.Fourth;

import java.util.Arrays;
import java.util.List;

public class FourthOne {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("asd","sdf","","qwe","");
        long count = str.stream().filter(s -> s.isEmpty()).count();
        System.out.println(count);
    }
}
