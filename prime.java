// Qs. Print if a number is prime or not (Input n from the user).
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < (n/2); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            if (n == 1 || n == 0) {
                System.out.println("This is nither a Prime nor a Composite.");
            } else {
                System.out.println("This is Prime.");
            }
        }
        else {
            System.out.println("This is not a Prime.");
        }
    }
}
