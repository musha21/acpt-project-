import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the name -");
        String studentName = scan.next();

        System.out.print("enter the physics marks -");
        int physicsMark = scan.nextInt();

        System.out.print("enter the chemistry mark -");
        int chemistryMark = scan.nextInt();

        System.out.print("enter the maths mark -");
        int mathsMark = scan.nextInt();

        System.out.println("Average marks -"+(mathsMark+physicsMark+chemistryMark)/3);





    }
}
