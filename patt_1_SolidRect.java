/* Solid Rectangle:
                    * * * * *
                    * * * * *
                    * * * * *
                    * * * * *
 */
public class patt_1_SolidRect {
    public static void main(String[] args) {
        byte m = 4, n = 5;
        // Outter loop -> column
        for (int i = 0; i < m; i++) {
            // Inner loop -> row
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            // next line
            System.out.println();
        }
    }
}
