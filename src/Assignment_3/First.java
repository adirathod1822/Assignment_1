package Assignment_3;
import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of operation :- ");
        int numOp=sc.nextInt();
        String[] ans = new String[numOp];
        if(numOp <4) for (int i = 0; i < numOp; i++) {
            System.out.print("Choose Operation type :");
            int choice=sc.nextInt();
            System.out.print("Enter the number : ");
            int value=sc.nextInt();
            switch (choice){
                case 1:
                    ans[i] = isOdd(value) ?"Odd":"Even";
                    break;
                case 2:
                    ans[i] = isPrime(value) ?"Prime":"Composite";
                    break;
                case 3:
                    ans[i] = isPalindrome(value) ?"Palindrome":"NotPalindrome";
                    break;
            }
        }
        else System.out.println("Invalid Operation!!");
        for(String s:ans){
            if(s!=null) System.out.println(s);
        }

    }
    public static boolean isOdd(int n){
        return n%2==1;
    }
    public static boolean isPrime(int n){
    if(n <= 1) return false;
        for (int i = 2; i < n/2; i++) {
            if(n%i == 0 ) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int num){
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
