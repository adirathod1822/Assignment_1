package Assignment_3;
import java.util.*;

public class Third {
    public static void main(String[] args) {
        int[] colorSocks={10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n=colorSocks.length;
        System.out.println(sockMerchant(n,colorSocks));
    }
    public static int sockMerchant(int n, int[] colorSocks){

        int ans = 0;
        int temp = 1;
        Arrays.sort(colorSocks);
        for (int i = 0; i < n - 1; i++) {
            if (colorSocks[i] == colorSocks[i + 1]) {
                temp++;
                if(i==n-2){
                    ans+=temp/2;
                }
            }
            else {
                ans += temp / 2;
                temp = 1;
            }
        }
        return ans;
    }
}
