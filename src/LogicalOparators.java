import java.util.Scanner;
public class LogicalOparators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter your name - ");
        String name = scan.next();


        System.out.print("enter your age - ");
        int age = scan.nextInt();

        System.out.print("enter is married ? ");
        boolean status = scan.nextBoolean();




        if(age>=18){

                char firstLetter = name.charAt(0);//-------> get first latter in name
                int askiVlaue = firstLetter;

            if(askiVlaue>=70 && status){
                System.out.print("eligible");
            }
            else {
                System.out.print("not eligible");
            }



        }
        else{
            System.out.println("if not eligable , age is not enough");
        }

    }
}
