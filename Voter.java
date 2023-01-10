import java.util.Scanner;

public class Voter {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        byte age = inp.nextByte();

        if (age <= 18) {
            System.out.println("Not Elligable to Vote");
        } else {
            System.out.println("Elligable to Vote.");
        }
    }
}
