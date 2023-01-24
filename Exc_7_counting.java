/* Write a program to enter the numbers till the user wants and at the end it
should display the count of positive, negative and zeros entered. */

// the code bellow has been taken from OpenAI ChatGPT.
import java.util.Scanner;

public class Exc_7_counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while (true) {
            System.out.print("Enter a number (or 'q' to quit): ");

            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'q' to quit.");
                }
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
    }
}

// import java.util.Scanner;

// public class Exc_7_counting {

//     public static void main(String[] args) {
//         Scanner sc = 
//     }
// }