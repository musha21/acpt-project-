import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the number - ");
        int number01 = scan.nextInt();

        if(number01%2 ==0){

            System.out.println("even number ");
        }
        else {
            System.out.println("odd number ");
        }
    }
}
