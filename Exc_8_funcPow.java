import java.util.Scanner;

public class Exc_8_funcPow {
    public static double power(int x, int n) {
        for (int i = 1; i < n; i++) {
            x *= x;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        double r = power(x, n);
        
        System.out.println("x^n = "+r);
    }
}
