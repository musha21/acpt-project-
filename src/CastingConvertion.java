import java.util.Scanner;

public class CastingConvertion {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("give boy name - ");
        String boy = scan.next();

        System.out.print("give girl name - ");
        String girl = scan.next();

        char firstLetter = boy.charAt(0);//-------> get first latter in name
        System.out.println("boy first latter :"+firstLetter);

       char lastLetter = girl.charAt(girl.length() - 1);//-------> get last  latter in name
        System.out.println("boy latter  :"+lastLetter);


      int first = firstLetter;
      int last =  lastLetter;


      System.out.println("lucky no : "+(first+last)/2);




    }
}
