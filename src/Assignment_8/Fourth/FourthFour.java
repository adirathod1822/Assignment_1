package Assignment_8.Fourth;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FourthFour {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("asd","sdf",null,"qwe",null);
        List<String> fstr = str.stream().filter(s -> s!=null).collect(Collectors.toList());
        System.out.println(fstr);
    }
}
