package Leetcode;
import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int row = ip.nextInt();
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < row - i ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = row; i > 0; i--) {
            for (int k = 0; k < row -i ; k++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
