package Assignment_2;

public class Fourth {

        public static void main(String[] args) {
            int n = 5;
            char currentChar = 'A';
            alphaPattern(n,currentChar);

        }
    public static void alphaPattern(int n, char alpha){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print(alpha);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            alpha++;
        }

        alpha -= 2;

        // Lower half of the diamond
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print(alpha);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            alpha--;
        }
    }
}
