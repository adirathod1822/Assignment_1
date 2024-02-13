package Assignment_3;

import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.print("Enter numbers of character: ");
        long n = sc.nextLong();
        System.out.print(repeatedAinInfiniteString(s,n));

    }
    public static long repeatedAinInfiniteString(String s, long n){
        int len = s.length();
        int index = 0;
        long count=0;
        for(int i=0; i<s.length();i++) {
            if ('a' == s.charAt(i)) {
                index++;
                if (i<n%len) count+=1;
            }
        }
        count += (n/len)*index;
        return count;
    }
}