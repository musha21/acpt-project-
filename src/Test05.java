//         there are  4 bussinessman  in city
//        take their august month income as your i nputs
//        find their average monthly income
//        employee should pay 13% tax from their income
//        find the total tax value they pay for government




import java.util.Scanner;
public class Test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1 st Businessman august income :");
        double business01 = scan.nextDouble();

        System.out.print("2nd Businessman august income :");
        double business02 = scan.nextDouble();

        System.out.print("3rd Businessman august income :");
        double business03 = scan.nextDouble();

        System.out.print("4th Businessman august income :");
        double business04 = scan.nextDouble();



//        double avg = (business03+business01+business02+business04)/4;

//        double tax = (business03+business01+business02+business04)*13/100;


        System.out.println("Businessman average salary is :"+ (business03+business01+business02+business04)/4);

        System.out.print("Total text value :" +(business03+business01+business02+business04)*13/100);

    }
}
