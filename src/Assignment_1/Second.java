package Assignment_1;

public class Second {
    public static void main(String[] args) {
        int[] arr = {39, 32, 51, 60, 54, 60};
        int max=0;
        int runner=0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i]>max){
                runner = max;
                max = arr[i];
            }
            else if(arr[i]>runner && max!=arr[i]){
                runner = arr[i];
            }
        }
        System.out.println("The winner is with marks : " + max);
        System.out.println("The runners up with marks : " + runner);
    }
}
