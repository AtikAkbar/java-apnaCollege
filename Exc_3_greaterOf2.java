import java.util.Scanner;

/*Write a function which takes in 2 numbers and returns the greater of those two. */
public class Exc_3_greaterOf2 {
    public static int greater(int n1,int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(greater(a, b)+" is greater.");
    }
}
