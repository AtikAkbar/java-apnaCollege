/* Half Pyramid:
                * 
                * *
                * * *
                * * * * 
 */
public class patt_3_HalfPyra {
    public static void main(String[] args) {
        byte n = 4;
        // outter loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
