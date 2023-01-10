/* 0-1 Triangle:
            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
 Relation: 
 if (i+j) is Even print 1, if Odd print 0.
 To understand watch : https://youtu.be/GjHNGM7KN3w time:(51:05) or (48:45)
 */
public class patt_9_01triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
