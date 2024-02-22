import java.util.Arrays;
import java.util.function.Predicate;

public class lc389 {
    public static void main(String[] args) {
//        String s = "";
        String s = "abcd";
        String t = "y";

            int res = 0;
            for(char c:s.toCharArray()) {
                res = res ^ c;
                System.out.println(res);
            }
            for(char c:t.toCharArray())
                res = res^c;
//        System.out.println(res);


//        System.out.println(s.length());
////        String t = "abcde";
//        char[] sc = s.toCharArray();
//        Arrays.sort(sc);
//        char[] tc = t.toCharArray();
//        Arrays.sort(tc);
//        System.out.println(Arrays.toString(sc));
//        System.out.println(Arrays.toString(tc));
//        int i= 0;
//        while(i!=tc.length){
//            if(sc.length==0) {
//                System.out.println(tc[0]);
//                break;
//            }
//            if(tc[i]!=sc[i]) {
//                System.out.println(tc[i++]);
//            }
//            else {
//                System.out.println(tc[sc.length]);
//                break;
//            }
//        }
//        for (int i = 0; i < t.length(); i++) {
//            if(1==tc.length) {
//                System.out.println(tc[i]);
//                break;
//            }
//            else if( i==sc.length-1){
//                System.out.println(tc[sc.length]);
//                break;
//            }
//            else if(tc[i]!=sc[i]) {
//                System.out.println(tc[i]);
//                break;
//            }
//        }
    }
}
