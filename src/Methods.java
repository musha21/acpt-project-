import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        for (int i =1;i<5;i++){
//
//            System.out.println("hii mushaa.........");
//
//        }
        calculateOddEven();
    }
    public static void calculateOddEven(){
        Scanner scan =new Scanner(System.in);

        System.out.println("enter the no:");
        int number =scan.nextInt();

        if(number%2==0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }

    }
}
