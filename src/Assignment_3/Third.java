package Assignment_3;
import java.util.*;

public class Third {
    public static void main(String[] args) {
        int[] colorSocks={10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n=colorSocks.length;
        int ans = 0;
//        System.out.println(sockMerchant(n,colorSocks));
        Map<Integer, Integer> freqMap = numFreq(colorSocks);
        for(Integer i : freqMap.keySet()){
            ans += freqMap.get(i)/2;
        }
        System.out.println(ans);
    }
    public static int sockMerchant(int n, int[] colorSocks){

        int ans = 0;
        Map<Integer, Integer> freqMap = numFreq(colorSocks);
        for(Integer i : freqMap.keySet()){
            System.out.println(freqMap.get(i));
        }
//        int temp = 1;
//        Arrays.sort(colorSocks);
//        for (int i = 0; i < n - 1; i++) {
//            if (colorSocks[i] == colorSocks[i + 1]) {
//                temp++;
//                if(i==n-2){
//                    ans+=temp/2;
//                }
//            }
//            else {
//                ans += temp / 2;
//                temp = 1;
//            }
//        }
        return ans;
    }
    public static Map<Integer, Integer> numFreq(int[] array){
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
        return freq;
    }
}
