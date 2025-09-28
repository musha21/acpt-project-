import java.util.Scanner;
public class CoupleMatch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("give a boy age : ");
        int bage = scan.nextInt();

        System.out.print("give a  girl age : ");
        int gage = scan.nextInt();

        if (bage>gage){

            System.out.print("give boy name - ");
            String boy = scan.next();

            System.out.print("give girl name - ");
            String girl = scan.next();

            char bfirstLetter = boy.charAt(0);//-------> get first latter in name
            System.out.println("boy first latter :"+bfirstLetter);

            char gfirstLetter = girl.charAt(0) ;//-------> get First latter in name
            System.out.println("boy latter  :"+ gfirstLetter);

            int bfirst = bfirstLetter;
            int gfirst = gfirstLetter;

            if (bfirst>gfirst){
                System.out.println("marry");
            }
            else {
                System.out.println("may be");
            }


        }

        else if(bage==gage){
            System.out.println(" think twice");
        }

        else{
            System.out.println(" don't  marry ");
        }
    }
}
