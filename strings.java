import java.util.*;

public class strings {
    public static void main(String[] args) {
        // string declaration
        String name = "Abid";
        String fullName = "Abid Hasan";
        String sentence = "My name is Abid Hasan.";

        // user input
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next(); // input a word
        String name2 = sc.next(); // input a word
        String fullName2 = sc.nextLine(); // input a line     

        // concatenation
        String mail = name1 + name2 + "@gmail.com";
        System.out.println(mail);
        // print the length of a string
        System.out.println(mail.length());

        // .charAt -> find a carecter of the string
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // .compareTo -> compare 2 strings
        /* cases checked:
         * s1 > s2 : +ve value
         * s1 = s2 : 0
         * s1 < s2 : -ve value 
         */
        if (name1.compareTo(name2) == 0) {
            System.out.println("Equal Strings.");
        }
        else{
            System.out.println("Not equal strings");
        }

        // .substring 

        // .parseInt -> convert string to integer

        // .toString -> convert integer to string
        
    }
}
