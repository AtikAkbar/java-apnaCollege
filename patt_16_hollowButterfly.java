/*  Hollow Butterfly:
            *             *
            * *         * *
            *   *     *   *
            *     * *     *
            *     * *     *
            *   *     *   *
            * *         * *
            *             *
*/
public class patt_16_hollowButterfly {
    public static void main(String[] args) {
        int n = 4;
        // outer loop
        // upper part
        for (int i = 1; i <= 2*n; i++) {
            // inner loop
            // 1st part
            for (int j = 1; j <= 2*n; j++) {
                // if (i == 1 || i == 2*n || i == j || (i+j) == 2*n) {
                if (i == 1 || i == 2 * n || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
