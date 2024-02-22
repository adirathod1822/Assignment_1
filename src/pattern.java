import java.util.HashMap;

public class pattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String st = "dog dog dog dog";
        String[] word = st.split(" ");
        HashMap<Character, String > map = new HashMap<>();
        for(int i=0; i<pattern.length();i++) {
            System.out.println(pattern.charAt(i) +";"+word[i]);
            if(!map.containsKey(pattern.charAt(i)) && !map.containsValue(word[i])) map.put(pattern.charAt(i), word[i]);
            else  if ( !map.containsKey(pattern.charAt(i)) ||  !map.get(pattern.charAt(i)).equals(word[i])) System.out.println("false");
        }
        System.out.println(map);
//        System.out.println(word[2]);
    }
}
