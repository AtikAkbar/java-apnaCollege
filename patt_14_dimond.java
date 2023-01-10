/* Dimond Pattern:
              *
            * * *
          * * * * *
        * * * * * * *
        * * * * * * *
          * * * * *
            * * *
              *
 */
public class patt_14_dimond {
    public static void main(String[] args) {
        int n = 4;
        // upper part
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <=(n-i)*2 ; j++) {
                System.out.print(" ");
            }
            // *
            for (int j = 1; j <=(i*2)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower part
        for (int i = n; i >= 1; i--) {
            // space
            for (int j = 1; j <=(n-i)*2 ; j++) {
                System.out.print(" ");
            }
            // *
            for (int j = 1; j <=(i*2)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
