/* Palindromic Number Pyramid:
                ----1       [- reprensnt space]
                ---212
                --32123
                -4321234
                543212345
 */
public class patt_13_pldmNumPyra {
    public static void main(String[] args) {
        byte n = 5;
        // outter loop
        for (int i = 1; i <= n; i++) {
            // inner loop

            // print space 
            /*---
              --
              -
             */
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            // print number 
            // 1st part
            /*      1
                  2 1
                3 2 1
              4 3 2 1
            */ 
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            // 2nd part
            /*      
                       2
                       2 3
                       2 3 4
             */
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
