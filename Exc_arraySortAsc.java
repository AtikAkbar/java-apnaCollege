// Take an array of numbers as input and check if it is an array sorted in ascending order.

public class Exc_arraySortAsc {
    public static void main(String[] args) {
        int []num = {1,7,9,24,12};
        int a = Integer.MIN_VALUE;
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] > a) {
                a = num[i];
            }
            else {
                break;
            }
        }

        if (a == num[num.length-1]) {
            System.out.println("sorted in ascending order");
        } else {
            System.out.println("not sorted in ascending order");
        }
    }
}
