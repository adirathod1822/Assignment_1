package Assignment_5;

import java.util.*;

public class Tenth {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(str);
        System.out.println(ans);

    }
        public static List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> res = new HashMap<>();

            for (String s : strs) {
                int[] count = new int[26];

                for (char c : s.toCharArray()) {
                    count[c - 'a']++;
                }

                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 26; i++) {
                    sb.append('#');
                    sb.append(count[i]);
                }
                String key = sb.toString();

                if (!res.containsKey(key)) {
                    res.put(key, new ArrayList<>());
                }
                res.get(key).add(s);
            }

            return new ArrayList<>(res.values());
        }

}
