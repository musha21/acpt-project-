import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = 5;// -----> single
        System.out.println(age);

        int[] ages = new int [10];
        ages[3] = 54;
        System.out.print(ages[3]);

        for (int i = 0;i<10;i++){
            System.out.print("enter value for variable " + i);
            ages[i]= scan.nextInt();
        }
        /// ////////////////
        for(int i = 0;i<10;i++){
            System.out.println(ages[i]);
        }
    }
}
