package Assignment_3;

import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.print("Enter numbers of character: ");
        long n = sc.nextLong();
        System.out.println(repeatedAinInfiniteString(s,n));

    }
    public static long repeatedAinInfiniteString(String s, long n){
        int len = s.length();
        int index = 0;
        int j =0;
        for(int i=0; i<s.length();i++){
            if('a'==s.charAt(i)) index++;
        }
        return (n/len)*index + (n%len);
    }
    }