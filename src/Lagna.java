import java.util.Scanner;

public class Lagna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dbEmail = "mrmusha2021@gmail.com";
        int dbPassword = 123456789;

        System.out.print("enter your email id -");
        String userEmail = scan.next();

        boolean isLoginSucsess = false;

        for(int i=0;i<5;i++){
            System.out.print("enter your password - ");
            int userPassword = scan.nextInt();

            if (dbPassword == userPassword && dbEmail.equals(userEmail)) {
                isLoginSucsess = true ;
                break;}

            if(i==4){
                System.out.println("Account Locked !");
                break;

            }
                System.out.println("Password incorrect try again !. (Rounds Remaining : " + ((5-(i+1))));


        }


        if(isLoginSucsess){


            System.out.print("enter your name - ");
            String name = scan.next();

            System.out.print("enter your age - ");
            int age = scan.nextInt();


            if (age >= 18) {
                int value = name.charAt(0);

                String result;
                if (value % 2 == 0) {
                    result = " වාසනාවන්තයෙකි ";
                } else {
                    result = " අවාසනාවන්තයෙකි ";
                }

                System.out.print("enter your lagna - ");
                String lagna = scan.next();

                String results02 ;

                switch (lagna) {
                    case "mesa":
                        results02=" යහපත් ඇසුර සහ යහපත් ආර්ථිකයක්. ";
                        break;
                    case "singhe":
                        results02=" වස්තුව සහ සැප සම්පත් ලඟා වේ .";
                        break;
                    case "danu":
                        results02="රහස් සතුරන් සහ හීන වන ශරීර සෞඛ්ය";
                        break;

                    case "kaneha":
                        results02="දක්ෂතා මතු වේ, ඉනීමෙන් ඉහළටම";
                        break;

                    case "makra":
                        results02="රහස් සතුරන් සහ හීන වන ශරීර සෞඛ්ය";
                        break;

                    case "vashe":
                        results02="අන් අයගේ සිත් දිනා ගනී";
                        break;
                    default:
                        results02="No";
                }

                System.out.println(name + " ඔබ " + result + results02 );
            } else {
                System.out.println("age is not enough");
            }
        }









        }
}
