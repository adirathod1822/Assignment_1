package Assignment_2;

public class Second {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 1;

        int[] rotatedArray = leftRotate(arr, d);

        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }

    }
    public static int[] leftRotate(int[] arr, int d) {
        int n = arr.length;
        int[] rotatedArray = new int[n];

        d = d % n;

        for (int i = 0; i < n - d; i++) {
            rotatedArray[i] = arr[i + d];
        }
        for (int i = 0; i < d; i++) {
            rotatedArray[n - d + i] = arr[i];
        }
        return rotatedArray;
    }
}

