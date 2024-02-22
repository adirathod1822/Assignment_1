package Assignment_8.Fourth;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FourthSix {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("asd","qwe","zxc");
        String str = s.stream().map(x ->x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(str);
    }
}
