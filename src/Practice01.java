import java.util.Scanner;
public class Practice01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double tax=0.0;

        for (int i=0;i<12;i++){
            System.out.print("employee salery  "+ (i+1)+ "-");
            double salary = scan.nextDouble();

            if (salary>130000){
             tax += salary*14/100;

            }

        }

        System.out.println(tax);

    }
}
