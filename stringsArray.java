// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;

public class stringsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String StrArr[] = new String[size];
        int totLength = 0;
        for (int i = 0; i < StrArr.length; i++) {
            StrArr[i] = sc.nextLine();
            
            totLength += StrArr[i].length();
        }
        
        System.out.println(totLength);
    }
}
