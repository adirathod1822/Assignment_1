package Leetcode;

public class sortedSum2 {
    public static void main(String[] args) {
        int[] numbers = {5,25,75};
        int target = 100;
        int i = 0;
        int j = 0;
        for (i = 0; i < numbers.length; i++) {
//            if(numbers.length%2==0)j = (numbers.length) / 2 ;
//            if(numbers.length%2==1)j = ((numbers.length) / 2) + 1 ;
            while (numbers[i] + numbers[j] != target) {
                if (target - numbers[i] > numbers[j]) j = (numbers.length + j) / 2;
                else if (numbers.length - 1 == j || j == 0) break;
                else if (target - numbers[i] < numbers[j]) j--;
            }
            if (numbers[i] + numbers[j] == target) {
                System.out.println(numbers[i] + "+" + numbers[j] + "=" + target);
                break;
            }
        }
    }
}
