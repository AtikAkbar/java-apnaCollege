/* Print the spiral order matrix as output for a given matrix of numbers. */
/*
Start
  |
  |
  |-----> Initialize variables m, n, top, bottom, left, and right
  |
  |
  |-----> While top <= bottom and left <= right, repeat the following steps
  |           |
  |           |-----> For i from left to right, print the elements of the top row of the sub-matrix
  |           |
  |           |-----> For i from top to bottom, print the elements of the right column of the sub-matrix
  |           |
  |           |-----> If top <= bottom, repeat the following step
  |           |           |
  |           |           |-----> For i from right to left, print the elements of the bottom row of the sub-matrix
  |           |
  |           |-----> If left <= right, repeat the following step
  |           |           |
  |           |           |-----> For i from bottom to top, print the elements of the left column of the sub-matrix
  |           |
  |           |-----> Increment top, decrement bottom, increment left, and decrement right
  |
  |
  |-----> End the algorithm when the while loop terminates
  |
End


Here's a step-by-step dry run of the code:

    1. Initialize the matrix mat with 5 rows and 6 columns of elements.

    2. Initialize the variables m and n to store the number of rows and columns of the matrix, respectively.

    3. Initialize the variables top, bottom, left, and right to store the indices of the top, bottom, left, and right edges of the matrix, respectively.

    4. Start a while loop that continues as long as top is less than or equal to bottom and left is less than or equal to right.

    5. Within the while loop, use a for loop to iterate through the elements in the first row from left to right and print each element.

    6. Increment top by 1 to move to the next row.

    7. Use another for loop to iterate through the elements in the last column from top to bottom and print each element.

    8. Decrement right by 1 to move to the next-to-last column.

    9. If top is less than or equal to bottom, use another for loop to iterate through the elements in the last row from right to left and print each element.

    10. Decrement bottom by 1 to move to the next-to-last row.

    11. If left is less than or equal to right, use another for loop to iterate through the elements in the first column from bottom to top and print each element.

    12. Increment left by 1 to move to the next column.

    13. Repeat steps 5 to 12 until the while loop condition is no longer satisfied.

    14. The elements of the matrix will be printed in a spiral order.
*/

public class Exc_1array2d {
    public static void main(String[] args) {
        int[][] mat = { {1,5,7,9,10,11},
                        {6,10,12,13,20,21},
                        {9,25,29,30,32,41},
                        {15,55,59,63,68,70},
                        {40,70,79,81,95,105}
                    };
        int m = mat.length;
        int n = mat[0].length;
        int top = 0, bottom = m-1, left = 0, right = n-1;

        while (top <= bottom && left <= right) {
            // ---> left to right
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] +" ");
            }
            top++;
            /*      top to bottom
             *  |
             *  |  
             *  v
             */
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] +" ");
            }
            right--;
            // <---     right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i] +" ");
                }
                bottom--;
            }
            // bottom to top
             
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left] +" ");
                }
                left++;
            }
        }
    }
}
