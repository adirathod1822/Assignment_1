import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "Hello                             world          ";

//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        System.out.println(sb);
//        char[] cstr = s.toCharArray();
//        List<String> l = new ArrayList<>();
//        String str = "";
//        for(int i=0; i< cstr.length; i++){
//            if(cstr[i]!=32)str += cstr[i];
//            else{
//                if(!str.equals(""))l.add(str);
//                str = "";
//            }
//        }
//        System.out.println(l);
//        int i = 0;
//        int j = l.size()-1;
//        String temp = "";
//        while(i<j){
//            temp = l.get(i);
//            l.add(i,l.get(j));
//            l.add(j,temp);
//            i++;
//            j--;
//        }
//        System.out.println(l);




        String[] ans = s.split(" ");
        int i = 0;
        int j = ans.length-1;
        String temp = "";
        while(i<j){
            temp = ans[i].trim();
            ans[i++] = ans[j].trim();
            ans[j--] = temp;
        }
        List<String> a = new ArrayList<>();

        System.out.println(Arrays.toString(ans));
        for(String q : ans ){
            if(!q.equals("")){
                a.add(q);
            }
        }
        System.out.println(a);
        String str = String.join(" ", a);

        System.out.println(str);
    }
}