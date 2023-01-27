/* Find the maximum & minimum number in an array of integers.
Apna College */
import java.util.Scanner;

public class Exc_arrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int number[] = new int[size];

        // input
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        int max = number[0], min = number[0];
        // Max Min
        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
            if (min > number[i]){
                min = number[i];
            }
        }
        // output
        System.out.println("Max = "+max+"\nMin = "+min);
    }
}
