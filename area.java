/* Make a program that takes the radius of a circle as input,calculates its radius and area and prints it as output to the user. */ 

import java.util.*;

public class area {
    public static void main(String[] args){
        //constant
        final float PI = 3.1416F;
        //scanner object
        Scanner sc = new Scanner(System.in);
        
        int radius = sc.nextInt();
        float Area = PI * radius * radius;

        System.out.println(Area);
    }
}
