package Assignment_5;

import java.util.*;
public class Fifth {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a digit you want to display: ");
            int n = sc.nextInt();
            switch (n) {
                case 0:
                    System.out.println(" __ \n|  | \n|__|");
                    break;
                case 1:
                    System.out.println("   \n   |\n   |");
                    break;
                case 2:
                    System.out.println(" __ \n __|\n|__ ");
                    break;
                case 3:
                    System.out.println(" __ \n __|\n __|");
                    break;
                case 4:
                    System.out.println("   \n|__|\n   |");
                    break;
                case 5:
                    System.out.println(" __ \n|__ \n __|");
                    break;
                case 6:
                    System.out.println(" __ \n|__ \n|__|");
                    break;
                case 7:
                    System.out.println(" __ \n   |\n   |");
                    break;
                case 8:
                    System.out.println(" __ \n|__|\n|__|");
                    break;
                case 9:
                    System.out.println(" __ \n|__|\n __|");
                    break;

            }
        }
    }

