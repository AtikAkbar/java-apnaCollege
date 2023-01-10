import java.util.*;

public class gretterOrLesser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("They are equal.");
        } else if (a > b) {
            System.out.println(a + " is gretter than " + b);
        } else {
            System.out.println(a + " is Lesser than " + b);
        }
    }
}
