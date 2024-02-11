package Assignment_1;
import java.util.*;

public class Third{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 3, 9, 10, 2, 4, 5};
        numFreq(array);
    }
    public static void numFreq(int[] array){
        int count = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }
            freq.put(array[i],count);
            count = 0;
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Frquency of elements: " + freq);
    }

}
