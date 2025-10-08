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

        for (int i = 0; i < accountNumbers.length; i++) {
            if (accountNumbers[i] == verifyAccountNoumber) {
                index = i;
                break;

            }
        }
        if (index!=-1){
            System.out.println("enter the account no"+accountNumbers[index]);
            System.out.println(accountHolders[index]+"balance :"+balances[index]);

        }
        else {
            System.out.println("invalid account number ");
        }

    }
}
