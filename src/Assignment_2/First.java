package Assignment_2;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter: ");
        int num = ip.nextInt();
        if (isPlaindrome(num) == true)
            System.out.print("Number is Palindrome");
        else System.out.print("Number is not Palindrome");
    }
    public static boolean isPlaindrome(int num){
        int reversed= 0;
        int rem = 0 ;
        int orginal = num;

        while (num > 0){
            rem = num % 10;
            reversed = (reversed * 10) + rem;
            num /= 10;
        }
        return orginal == reversed;
    }
}
