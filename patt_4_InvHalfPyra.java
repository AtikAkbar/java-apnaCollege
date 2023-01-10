/* Inverted Half Pyramid:
                        * * * *
                        * * *
                        * *
                        *
 */
public class patt_4_InvHalfPyra {
    public static void main(String[] args) {
        byte n = 4;
        // outter loop
        for (int i = n; i >= 1; i--) {
            // inner loop
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
