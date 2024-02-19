package Assignment_6;
import java.util.*;
import java.util.stream.*;
public class Fifth {
    public static void main(String[] args) {
        List<Long> ans = generateFib(15);
        System.out.println(ans);
    }
    public static List<Long> generateFib(long num){
        return Stream.iterate(
                new long[]{0,1},s->new long[]{s[1],s[0]+s[1]})
                .limit(num)
                .map(n->n[0])
                .collect(Collectors.toList());
    }
}
