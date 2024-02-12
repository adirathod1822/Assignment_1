package Assignment_3;

import java.math.BigInteger;

public class Second {
    public static void main(String[] args) {
        System.out.println(repeatedAinInfiniteString("a",100000000));;

    }
    public static int repeatedAinInfiniteString(String s, long n){
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n/s.length()+1; i++) {
            sb.append(s);
        }
        char[] arr = sb.toString().toCharArray();
        for(int i=0; i<n; i++) if(arr[i]=='a') count++;
        return count;
    }
}
