/* Inverted Half Pyramid (Rotated 180 degree):

                      *     [i = 4, j = 4]          [1 - *, (n-1) - sp]
                    * *     [i = 3, j = 3,4]        [2 - *, (n-2) - sp]
                  * * *     [i = 2, j = 2,3,4]      [3 - *, (n-3) - sp]
                * * * *     [i = 1, j = 1,2,3,4]    [4 - *, (n-4) - sp]
 */
public class patt_5_InvHalfPyraRot180 {
    public static void main(String[] args) {
        byte n = 4;

        // *************** Solution - 1:**************

        // outter loop
        for (byte i = n; i >= 1; i--) {
            // inner loop
            for (byte j = 1; j <= n; j++) {
                // condition for space and *
                if (j < i) 
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            // sout for next line
            System.out.println();
        }

        // ***************Solution - 2:***************

        // outter loop
        for (byte i = 1; i <= n; i++) {
            // inner loop 

            // loop for - space
            for (byte j = 1; j <= (n-i); j++) {
                System.out.print("  ");
            }
            // loop for - *
            for (byte j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // sout for next line
            System.out.println();
        }
    }
}
