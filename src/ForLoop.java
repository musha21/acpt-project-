import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("employee01 salary -");
//        double salary01 = scan.nextDouble();
//
//        System.out.println("employee02 salary -");
//        double salary02 = scan.nextDouble();
//
//        System.out.println("employee03 salary -");
//        double salary03 = scan.nextDouble();
//
//        System.out.println("employee04 salary -");
//        double salary04 = scan.nextDouble();
//
//        System.out.println("employee05 salary -");
//        double salary05 = scan.nextDouble();
//
//        System.out.println((salary02+salary04+salary03+salary04+salary05)/5);



        double totalSalary=0.0;

        for (int i=1;i<5;i++){
            System.out.print("enter employee salary -");
            totalSalary += scan.nextDouble();

            if(totalSalary>=1000){
                break;
            }
            System.out.println("hiii");
        }


//        int no1=10;
//        no1 +=2;
//
//        System.out.println(no1);

//        int a = 5;
//        System.out.println(++a); // Pre-increment
//        System.out.println(a++);

    }}

