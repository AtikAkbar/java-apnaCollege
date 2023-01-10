import java.util.*;
public class simpleCalculator {
    public static void main(String[] args) {
        System.out.println("Oparations: \n1.Addition \n2.Substruction \n3.Multiplication \n4.Division \n5.Modulas");
        
        Scanner sc = new Scanner(System.in);
        byte oparation = sc.nextByte();
        int a, b;

        switch (oparation) {
            case 1:
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a + "+" + b + "=" +(a + b));
                break;
            case 2:
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a + "-" + b + "=" +(a - b));
                break;
            case 3:
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a + "*" + b + "=" +(a * b));
                break;
            case 4:
                a = sc.nextInt();
                b = sc.nextInt();
                if (b == 0) {
                    System.out.println(" Invalid Devision ");
                } else {
                    System.out.println(a+"/"+b+"="+(a / b));
                }
                break;
            case 5:
                a = sc.nextInt();
                b = sc.nextInt();
                if (b == 0) {
                    System.out.println(" Invalid Devision ");
                } else {
                    System.out.println(a + "%" + b + "=" + (a % b));
                }
                break;
            
            default:
                System.out.println("Invalid Oparation.");
                break;
        }

    }
}
