import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the no ");
        int no = scan.nextInt();


        while (no > 0) {

            System.out.print(no%10 + ",");
            no = no/10;



        }
    }
}
