//There are 15 students in a class. A student has 6 subjects to learn
//Get student names and their marks for all the subjects and store them in proper way

//create a method to find total marks for all students (student by student)
//and find each one's average mark
//find the max total marked student's name
//find how many students are eligible for parents meeting
//(Fact - Average mark should be l


import java.util.Scanner;

public class ReturnTypeMethodsQs02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] studentName = new String[15];
        double[][] studentmarks = new double[15][6];

        for (int i = 0; i < 3; i++) {
            System.out.print("enter the " + (i + 1) + "student name :");
            studentName[i] = scan.next();
            for (int j = 0; j < 2; j++) {
                System.out.println(studentName[i] + "enter the mark :");
                studentmarks[i][j] = scan.nextInt();
            }
        }
        int[] totalMarkss = getTotal(studentmarks);
        for(int i=0;i<3;i++){
            System.out.println(studentName[i]+"student marks"+totalMarkss[i]);
        }

        int[] average = getAverage(totalMarkss);
        for(int i=0;i<3;i++){
            System.out.println(studentName[i]+" average is "+average[i]);
        }
        int parentMeetingCount=0;
        for (int i =0;i<3;i++){

            if(average[i]<40){
                parentMeetingCount++;

            }
        }
        System.out.println("tota count of students parents meeting : "+parentMeetingCount);

    }


    public static int[] getAverage(int[] to) {
        int[] average = new int[15];

        for (int i = 0; i < 3; i++) {
            average[i] = to[i] /2;
        }
        return average;
    }
    public static int[] getTotal(double[][] studentMarks) {

        int[] totalMarks = new int[15];


        for (int i = 0; i < 3; i++) {
            int eachStudentTotal = 0;
            for (int j = 0; j < 2; j++) {
                eachStudentTotal += studentMarks[i][j];
            }

            totalMarks[i] = eachStudentTotal;
        }
        return totalMarks;


    }
}