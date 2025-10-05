import java.util.Scanner;

public class SalaryIncrement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] salary = new double[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("enter the " + (i + 1) + " employee salary - ");
            salary[i] = scan.nextDouble();
        }

        double[] newSalary = new double[8];

        for (int i = 0; i < 8; i++) {

            if (salary[i] > 130000) {
                newSalary[i] = salary[i] + (salary[i] * 12 / 100);
            }
            else {
                newSalary[i] = salary[i];
            }
        }
         double oldCost = 0.0;
        double newCost = 0.0;

        for (int i = 0; i < 8; i++){

            oldCost += salary[i];
            newCost+=newSalary[i];
        }


        System.out.println( "over the cost"+(newCost-oldCost));



//        System.out.print(newSalary);


    }


}

