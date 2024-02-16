package Assignment_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class newNewTenth {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        //aet,[eat, tea]
        List<List<String>> ans = stringListAnagrams(str);
        System.out.println(ans);
    }

    static List<List<String>> stringListAnagrams(String[] str) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            char[] chArr = str[i].toCharArray();
            Arrays.sort(chArr);
            if (!map.containsKey(Arrays.toString(chArr))) {
                map.put(Arrays.toString(chArr), new ArrayList<>());
                map.get(Arrays.toString(chArr)).add(str[i]);
            } else
                map.get(Arrays.toString(chArr)).add(str[i]);
        }
        List<List<String>> ans = new ArrayList<>(map.values());
        return ans;
    }
}