import java.util.Scanner;

public class BankingSystem02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] accountHolders = {"Alice", "Bob", "Charlie"};
        int[] accountNumbers = {101, 102, 103};
        double[] balances = {5000.0, 3000.0, 7000.0};

        int index = -1;


        System.out.println("enter the account no:");
        int verifyAccountNoumber = scan.nextInt();

        double deposit ;
        double withdraw ;


        for (int i = 0; i < accountNumbers.length; i++) {
            System.out.println("CHOOSE THE OPTION");
            String choise = scan.next();

            if (accountNumbers[i] == verifyAccountNoumber) {


                if (choise.equals("A")) {
                    System.out.print("enter the deposit money :");
                    deposit = scan.nextDouble();
                    balances[i] += deposit;
                    index = i;
                    break;
                }

                if (choise.equals("B")) {
                    System.out.print("enter the withdraw money :");
                    withdraw = scan.nextDouble();
                    if (withdraw <= balances[i]) {
                        balances[i] -= withdraw;
                        index = i;
                        break;
                    } else {
                        System.out.println("in sufficient funds");

                    }


                }

            }

        }
        if (index != -1) {

            System.out.println(accountHolders[index] + " balance :" + balances[index]);

        } else {
            System.out.println("invalid account number ");
        }

    }
}
