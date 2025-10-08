import java.util.Objects;
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] holdersName = new String[13];
        int[] accountNumber = new int[13];
        double[] amount = new double[13];
        double accountBalance = 0.0;

        for (int i = 0; i < 5; i++) {
            System.out.print("enter the" + (i + 1) + " account holder name :");
            holdersName[i] = scan.next();

            System.out.print("enter the" + (i + 1) + " account holder number:");
            accountNumber[i] = scan.nextInt();

            amount[i] = accountBalance;

        }
        String withdraw = "A";
        String deposit = "B";
        String choice;

        double newAmount;
        int verifyAccountNumber;
        int index = -1;

        while (true) {
            System.out.println("enter the option :  ");
            System.out.println("A) withdraw  ");
            System.out.println("B) Deposit  ");

            choice = scan.next();


            System.out.print("enter the account number : ");
            verifyAccountNumber = scan.nextInt();

            for (int j = 0; j < accountNumber.length; j++) {
                if (accountNumber[j] == verifyAccountNumber) {
                    index = j;
                    break;
                }
            }
            System.out.println("enter the amount : ");
            newAmount = scan.nextDouble();

            if(choice.equals("A")){
                if(accountBalance<newAmount){
                    System.out.println("not enaghf money  ");
                    System.out.println("withdraw after : total balance :"+ accountBalance);

                }
                else {
                    accountBalance -=newAmount;
                    System.out.println(holdersName[index] +" total balance :"+ accountBalance);
                }
            } else if (choice.equals("B")){
                accountBalance+=newAmount;
                System.out.println(holdersName[index] +" total balance :"+ accountBalance);
            }
           {

            }


        }
    }
}






