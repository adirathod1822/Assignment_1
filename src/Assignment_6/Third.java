package Assignment_6;
import java.util.*;
import java.util.stream.Collectors;

public class Third {
    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] a = {1,2,2,4,2,5,4,3,5};
        List<Integer> list= new ArrayList<>(List.of(a));
        Map<Integer, Long> map = list
                .stream()
                .distinct()
                .collect(Collectors.toMap(entry -> entry, entry -> list.stream().filter(entry::equals).count()));
        System.out.println(map);

//        list.stream().distinct().collect(Collectors.toMap(n -> n, n-> list.stream().filter(n::equals).count()));
    }
}
