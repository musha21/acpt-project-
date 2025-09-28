import java.util.Scanner;

public class CoupleMatch02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter your name -");
        String boyName = scan.next();

        System.out.print("enter your age - ");
        int boyAge = scan.nextInt();

        for (int i = 0; i<10;i++){
            System.out.print("enter  " + (i+1)+ " girl friend name -");
            String girlName = scan.next();

            System.out.print("enter  " + (i+1)+ " girl friend age -");
            int girlAge = scan.nextInt();

            char boyFirstLetter = boyName.charAt(0);
            char girlFirstLetter = girlName.charAt(0);


            int boyAsciiValue=boyFirstLetter;
            int girlAsciiValue= girlFirstLetter;

            if(boyAsciiValue<=girlAsciiValue && girlAge<boyAge){
                System.out.println("match");
                break;
            }

            else{
                System.out.println("no match");
            }




        }


    }
}
