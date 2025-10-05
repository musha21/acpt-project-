import java.util.Scanner;

public class ArrayQs2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] temp = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("enter the day temp");
            temp[i] = scan.nextInt();

        }
        int maxTemp = temp[0];
        int lowTemp= temp[0];

        for (int i = 0; i < 7; i++) {
            if (maxTemp < temp[i]) {
              maxTemp  = temp[i] ;
            }
            if (lowTemp > temp[i]) {
                 lowTemp = temp[i];
            }
        }

        System.out.println("low temp " + lowTemp);
        System.out.println("max temp " + maxTemp);

    }
}
