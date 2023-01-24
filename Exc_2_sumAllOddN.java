/* Write a function to print the sum of all odd numbers from 1 to n. */

import java.util.Scanner;

public class Exc_2_sumAllOddN {
    public static int OddSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i += 2) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(OddSum(n));
    }
}
