import java.util.Scanner;

public class func_sum {
    public static int sumTwoNum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sumTwoNum(a, b));
    }
}