package Assignment_1;
import java.util.*;

public class First {
    public static void main(String[] args) {
//        user input:
            //        Scanner ip = new Scanner(System.in);
            //        System.out.println("Enter total numbers elements: ");
            //        int n = ip.nextInt();
            //        int[] array = new int[n];
            //        System.out.println("Enter elements: ");
            //        for (int i=0; i<n; i++){
            //            array[i] = ip.nextInt();
//        }
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 3, 9, 10};
        System.out.println("Array with duplicate elements: " + Arrays.toString(array));


        int[] newArr = removeDuplicates(array);
        System.out.println("New array without duplicate elements: " + Arrays.toString(newArr));
    }
    public static int[] removeDuplicates(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        int j = 0;
        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }
        array[j++] = array[length - 1];
        int[] newArray = new int[j];
        for (int i = 0; i < j; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}


