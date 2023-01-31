/* input a matrix from user and search for a number x in the matrix, if found print the index. */
import java.util.Scanner;

public class array2D_findX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mat[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 } };

        int x = sc.nextInt();

        boolean found = false;
            // mat.length -> returns the number of row in a 2d array.
        for (int j = 0; j < mat[0].length; j++) {
            // mat[0].length -> returns the number of column in its 0th row. in a 2d array all the row has the same number of column.
        for (int i = 0; i < mat.length; i++) { 
                if (mat[i][j] == x) {
                    System.out.println("Found at index: [" + i +","+ j +"]");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Not found.");
        }
    }
}
