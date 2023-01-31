// For a given matrix of N x M, print its transpose.
import java.util.Scanner;

public class Exc_2array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int [row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix [i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
