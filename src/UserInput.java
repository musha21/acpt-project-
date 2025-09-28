
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("enter no1 -  ");
        int no1 = scan.nextInt();

        System.out.print("enter no2 -  ");
        int no2 = scan.nextInt();

        int answer = no1 + no2;
        System.out.print("tot -" + answer);

//        arithmatic oprators ---> *,/,+,-,%

//        string ---> scan.next()
//        double--->scan.nextDouble()


    }
}