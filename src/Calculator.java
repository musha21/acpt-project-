import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter no1- ");
        int no1 = scan.nextInt();

        System.out.print("enter no2- ");
        int no2 = scan.nextInt();


        System.out.print("enter symbol- ");
        String tot= scan.next();

       int total = 0;


        switch (tot){
            case "+" :
                total = (no1+no2);
            break;

            case "-":
                total=(no1-no2);
                break;

            case"*":
                total=(no1*no2);
                break;

            case"/" :
                total=(no1/no2);
                break;

            default:
                System.out.println("invelid no");

        }
        System.out.println("total value - " + total);

    }
}
