package Leetcode;

public class commonStr {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        String ans = "";
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if(c1[i] == c2[i]) ans+=c1[i];
        }
        System.out.println(ans);
    }
}
