import java.util.Scanner;

public class Telcom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dbEmail = "mr";
        int dbPassword = 123;

        System.out.print("enter your email id -");
        String userEmail = scan.next();

        boolean isLoginSucsess = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("enter your password - ");
            int userPassword = scan.nextInt();

            if (dbPassword == userPassword && dbEmail.equals(userEmail)) {
                isLoginSucsess = true;
                break;
            }

            if (i == 4) {
                System.out.println("Account Locked !");
                break;

            }
            System.out.println("Password incorrect try again !. (Rounds Remaining : " + ((5 - (i + 1))));


        }

        if (isLoginSucsess) {


            int totalDialog = 0;
            int totalMobitel = 0;
            int totalAirtel = 0;

            System.out.print("today how many people want to meet ??");
            int countPeople = scan.nextInt();

            for (int i = 1; i <= countPeople; i++) {
                System.out.print("how many sims you use  ??");
                int countSim = scan.nextInt();


                for (int j = 0; j < countSim; j++) {
                    System.out.print("what is the sim " + (j + 1) + "  name ? - ");
                    String SimName = scan.next();


                    switch (SimName) {
                        case "Dialog":
                            totalDialog++;
                            break;

                        case "Mobitel":
                            totalMobitel++;
                            break;

                        case "Airtel":
                            totalAirtel++;
                            break;

                        default:
                            System.out.println("invelid no");
                    }

                }



            }
            if (totalDialog >= totalMobitel && totalDialog >= totalAirtel) {
                System.out.println("most sim users are Dailog ,sim count " + totalDialog);
            } else if (totalMobitel >= totalDialog && totalMobitel >=totalMobitel) {
                System.out.println("most sim users are Mobitel, sim count" + totalMobitel);
            } else {
                System.out.println("most sim users are airtel ,sim count " + totalAirtel);
            }
        }
    }
}

