/* Number Pyramid:
                                n=5
                 1          r-1 sp-4
                2 2         r-2 sp-3
               3 3 3        r-3 sp-2
              4 4 4 4       r-4 sp-1
             5 5 5 5 5      r-5 sp-0
 */
public class patt_12_NumbPyra {
    public static void main(String[] args) {
        byte n = 5;
        // outter loop
        for (int i = 1; i <= n; i++) {
            // inner loop

            // print space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // print number
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
