import java.util.Scanner;

public class ArrayQs1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] marks = new int [9];
        String[] subjact = new String[9] ;

        int total=0;

        for(int i = 0 ;i < 9;i++){

            System.out.print("enter subject "+ (i+1)+ " : ");
            subjact[i]= scan.next();

            System.out.print("enter the marks "  + " : ");
            marks[i]=scan.nextInt();
            total+= marks[i];

        }
//        find max mark name

        int maxMark= marks[0];
        int maxMarkIndex=0;

        for(int i = 0 ; i<9;i++){
//            maxMark=marks[i];
            if(marks[i] > maxMark) {
                maxMark = marks[i];       // update max value
                maxMarkIndex = i;
                }

            }


        System.out.println("max marked subject name is "+ subjact[maxMarkIndex]);
        System.out.println("avrage marks of student " + total/9);

        }

    }

