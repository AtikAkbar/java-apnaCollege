import java.util.Scanner;

public class func_factorial {
    public static int Factorial(int num) {
        int fact = 1;
        for (int i = 1; i <=num; i++) {
            fact *=i; 
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n+"! = "+Factorial(n));
    }
}
