/* Half Pyramid With Numbers:
                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
*/ 
public class patt_6_HalfPyraNumb {
    public static void main(String[] args) {
        byte n = 5;
        // outter loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
