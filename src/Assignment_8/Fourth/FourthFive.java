package Assignment_8.Fourth;
import java.util.*;
import java.util.stream.Collectors;

public class FourthFive {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("asd","qwe","a","");
        List<String> s = str.stream().filter(x -> x.length()>=2).collect(Collectors.toList());
        System.out.println(s);
    }
}
