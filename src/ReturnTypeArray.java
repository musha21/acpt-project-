import java.util.Scanner;

public class ReturnTypeArray {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int[] numbers={12,78,45,65,98,56};

        System.out.println("enter the value ");
        int checkingNumber= scan.nextInt();


      boolean find = findAvailability(numbers,checkingNumber);

        System.out.println(find);
    }

    public static boolean findAvailability(int[]numberArray, int number){

        for (int i =0;i<6;i++){
            if(numberArray[i]==number){
                return true;
            }
        }
        return false;
    }
}

