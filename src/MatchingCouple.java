import java.util.Scanner;

public class MatchingCouple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] boyName = new String[17];
        String [] girlName = new String[17];

        for (int i=0;i<5;i++){

            System.out.println("enter "+(i+1)+"boy name ");
            boyName[i]= scan.next();

            System.out.println("enter "+(i+1)+"girl name ");
            girlName[i]= scan.next();

        }

        getMatchCouple( boyName,girlName);
    }
    public static void getMatchCouple(String [] boyName ,String [] girlName ){



        int boyFirstLetter;
        int  girlLirstLetter;

       int matcheCouple =0;

    for (int i=0;i<5;i++){
         boyFirstLetter = boyName[i].charAt(0);
         girlLirstLetter = girlName[i].charAt(girlName[i].length() - 1);

        if (boyFirstLetter>girlLirstLetter){
            matcheCouple++;
        }
    }
        System.out.println("total matcing couple:"+matcheCouple);

    }
}
