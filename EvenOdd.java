import java.util.Scanner;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int x;
        Scanner inp = new Scanner(System.in);
        x = inp.nextInt();

        byte reminder =(byte) (x % 2);

        if (reminder == 0){
            System.out.println(x+" is Even");
        }
        else {
            System.out.println(x+" is Odd");
        }

    }
}
