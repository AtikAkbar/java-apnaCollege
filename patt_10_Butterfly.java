/* Butterfly Pattern:
            *             *
            * *         * *
            * * *     * * *
            * * * * * * * *
            * * * * * * * *
            * * *     * * *
            * *         * *
            *             *
 */
public class patt_10_Butterfly {
    public static void main(String[] args) {
        int n = 4;
        // upper part

        // outer loop for column
        for (int i = 1; i <= n; i++) {
            // inner loop

            // 1st batch of *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int j = 1; j <= (n-i)*2; j++) {
                System.out.print("  ");
            }
            // 2nd batch of *
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower part

        for (int i = n; i >= 1; i--) {
            
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
