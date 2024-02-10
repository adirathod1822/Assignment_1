package Assignment_2;

public class Sixth {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        digSumMatrix(matrix);
    }
    public static void digSumMatrix(int[][] matrix) {

        int diagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = i;
        }

        for (int i = 0; i < matrix.length; i++) {
            diagonalSum += matrix[i][i];
        }

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of elements on the diagonal: " + diagonalSum);
    }
}



