package Leetcode;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = createRandomNumberArray(10);
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length;i++){

        }
    }
    public static int[] createRandomNumberArray(int len){
        Random rand = new Random();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }
}
