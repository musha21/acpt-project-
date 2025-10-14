import java.util.Scanner;
public class getAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] age = new int[21];

        for (int i = 0; i<21;i++){
            System.out.print("enter the employee age:");
            age[i]=scan.nextInt();

            
        }
        System.out.println("enter age limit");
        int ageLimit = scan.nextInt();


        getAgeRange( age, ageLimit);

    }
/// ///////////////// parameaterized methods /////////
    public static void getAgeRange(int[] man, int man2){
        int ageRange = 0;
        for (int i = 0 ; i<21;i++){
            if(man2==man[i]){
                ageRange ++;
            }

        }

        System.out.println("total ageLimit count :"+ageRange);
    }
}
