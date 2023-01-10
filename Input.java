import java.util.*;

public class Input {
    public static void main(String[] args){
        //Input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();    // only catches the next word.
        System.out.println(name);
        sc = new Scanner(System.in);
        name = sc.nextLine();    // Catches the next full line.
        System.out.println(name);
    }
}
