import java.util.Scanner;

public class StudentMarkTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] studentName = new String[2];

        double[][] marks = new double[2][3];

        for (int i = 0; i < 2; i++) {
            System.out.println("enter the " + (i + 1) + " student Name: ");
            studentName[i] = scan.next();
            for (int j = 0; j < 3; j++) {


                System.out.println("enter the " + (j + 1) + " subject Marks: ");
                marks[i][j] = scan.nextDouble();

            }
        }
        double totalMarks[] = new double[2];
        double averageMarks[] = new double[2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                totalMarks[i] += marks[i][j];
                averageMarks[i]=totalMarks[i]/3;

            }
            System.out.println(studentName[i]+" avrage marks "+averageMarks[i]);

        }
        double higestAvarage=averageMarks[0];
        String topAvarageStudent=studentName[0];


        for (int i = 0; i < 2; i++){
            if(averageMarks[i]>higestAvarage){
                averageMarks[i]=higestAvarage;


            }

        }
        System.out.println(topAvarageStudent+"higest avarage marks is :"+higestAvarage);



    }
}
