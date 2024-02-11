package Assignment_1;
import java.util.*;
public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.nextLine();
        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.nextLine();

        String sum = addBinary(binary1, binary2);

        System.out.println("Sum of " + binary1 + " and " + binary2 + " is: " + sum);
    }
    public static String addBinary(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = binary1.length() - 1;
        int j = binary2.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? binary1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? binary2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        return result.toString();
    }
}
