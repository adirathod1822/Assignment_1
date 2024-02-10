package Assignment_2;

public class Third {
    public static void main(String[] args) {
        design(4);
    }
    public static void design(int n){
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // print star
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower pyramid
        for (int i = 1; i <= n - 1; i++) {
            // print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // print star
            for (int k = (n-i)*2-1; k>0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
