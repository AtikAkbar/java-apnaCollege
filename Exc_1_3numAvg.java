/* Enter 3 numbers from the user & make a function to print their average. */
import java.util.Scanner;

public class Exc_1_3numAvg {
    public static float Avg(int n1,int n2, int n3) {
        float Avrg = (float) (n1 + n2 +n3)/3;
        return Avrg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println(Avg(a, b, c));
        
    }
}
