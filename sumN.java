// print sum of n natural number.

import java.util.*;

public class sumN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // using for loop
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            
            if (i<n) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = "+ sum);

        // using while loop
        // int i = 1, sum = 0;
        // while (i <= n) {
        //     System.out.print(i);
            
        //     System.out.print("+");
        //     ++i;
        // }
        // System.out.print("=" + sum);
    }
}
