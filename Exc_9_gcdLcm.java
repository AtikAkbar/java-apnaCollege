import java.util.Scanner;

public class Exc_9_gcdLcm {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % 2;
            a = b;
            b = rem;
        }
        return a;
    }
    // public static int lcm(int a, int b, int gcd) {
        
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = gcd(a, b);
        // int lcm = lcm(a, b, gcd);

        System.out.println("GCD : "+gcd);
        // System.out.println("LCM : "+lcm);
    }
}
