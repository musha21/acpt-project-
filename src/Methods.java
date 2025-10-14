import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the no:");
        int num = scan.nextInt();
//        for (int i =1;i<5;i++){
//
//            System.out.println("hii mushaa.........");
//
//        }
//        calculateOddEven();
//        findOddEven(num);
        String name = findOddEven01(num);

    }

    /// ///////// normalized methods
//    public static void calculateOddEven(){
//        Scanner scan =new Scanner(System.in);
//
//        System.out.println("enter the no:");
//        int number =scan.nextInt();
//
//        if(number%2==0){
//            System.out.println("even number");
//        }
//        else {
//            System.out.println("odd number");
//        }
//
//    }
  //()----->parameater barckect
    /// ////parameterized methods
//    public static  void findOddEven(int number ){
//        if(number%2==0){
//            System.out.println("even number");
//        }
//        else {
//            System.out.println("odd number");
//        }
//    }
//
/// ////////////return typ mathods///
///
    public static  String findOddEven01(int num2) {
        if (num2 % 2 == 0) {
           return ("even number");
        } else {
           return ("odd number");
        }
    }
}
