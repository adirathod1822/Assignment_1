package Assignment_8;
import java.util.*;
import java.util.function.Predicate;

public class Second {
    public static void main(String[] args) {
        List<Integer> lst=new ArrayList<>();
        for (int i = 1; i < 8; i++) {
            lst.add(i);
        }
        System.out.println(lst.removeIf(n->n%2==1));
        //remove odd element in list
        lst.forEach(System.out::println);
    }
    public static List<String> removeNull(List<String> l, Predicate<String> p){
        while(l.iterator().hasNext()){
            if(!p.test(l.iterator().next())){
                l.iterator().remove();
            }
        }
        return l;
    }
}
