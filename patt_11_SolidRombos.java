/* Solid Rhombus:
                *  *  *  *  *
             *  *  *  *  *
          *  *  *  *  *
       *  *  *  *  *
    *  *  *  *  *
*/ 
public class patt_11_SolidRombos {
    public static void main(String[] args) {
        int n = 5;
        // outter loop 
        for (int i = 1; i <= n; i++) {
            // inner loop

            // print space
            for (int j = 1; j <= n-i; j++) {
                System.out.print("   ");
            }
            // print *
            for (int j = 1; j <= n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
