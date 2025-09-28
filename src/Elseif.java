import java.util.Scanner;
public class Elseif {
    public static void main(String[] args) {
//        int age=18;
//
//        if(age>18){
//            System.out.println("hello");
//        }
//        else if(age>15){
//            System.out.println("bro");
//        }
//        else if(age>12){
//            System.out.println("what's up");
//        }
//        else{
//            System.out.println("buck u ");
//        }
        Scanner scan = new Scanner(System.in);

        System.out.print("salary income :");
        double salary = scan.nextDouble();


        System.out.print("land income :");
        double land = scan.nextDouble();

        System.out.print("kudu income :");
        double kudu = scan.nextDouble();





        if (kudu>0){
           kudu= kudu/2;
        }

        if (salary>=115000){
          salary = salary - (salary*14/100);

        }


        double fSalary = salary - (salary*14/100);



        System.out.println("total income : "+(salary+land+kudu));






 }

}
