import java.util.Scanner;

public class Func_ifPrime {
    public static void primeOrNot(int n) {
        byte count = 0;
        for (int i = 1; i <= (n/2); i++) {
            int result = n % i;
            if (result == 0) {
                count++;
                if (count == 2) {
                    break;
                }
            }
        }
        if (count == 2) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        primeOrNot(n);
    }
}
