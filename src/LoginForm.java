import java.util.Scanner;

public class LoginForm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dbEmail = "mrmusha2021@gmail.com";
        int dbPassword = 123456789;

        System.out.print("enter your email id -");
        String  userEmail = scan.next();

    for(int i = 0;i<5;i++){

            System.out.print("enter your password - ");
            int    userPassword = scan.nextInt();

            if (dbPassword == userPassword && dbEmail.equals(userEmail)){
                System.out.println("login Success");
                break;
            }

            if (i==4){
                System.out.println("Account locked");
                break;
            }

        System.out.println("try again (remaining attempts:)" + (5-(i+1)));


    }






    }
}
