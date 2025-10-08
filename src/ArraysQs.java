import java.util.Scanner;

public class ArraysQs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] totalSalary = new double[2];
        String[] department = new String[2];
        double[][] employeeSalary = new double[2][3];


        double higestAvarageSalery = 0.0;
        int index = -1;
        String higestAvarageDepartment ="";
        for (int i = 0; i < 2; i++) {
            System.out.print("enter " + (i + 1) + " department name :");
            department[i] = scan.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("enter " + (j + 1) + " employee salery :");
                employeeSalary[i][j] = scan.nextDouble();
            }




/// calculate avrage
            for (int x=0;x<2;x++){
                for (int y=0;y<3;y++){
                    totalSalary[x]+=employeeSalary[x][y];


                }
            }
            System.out.println(department[i]+" avarage salary :"+ totalSalary[i]/3);


///// calculate higest avarge
            for (int x=0;x<2;x++){
                for (int y=0;y<3;y++){
                    if(higestAvarageSalery<totalSalary[i]/3){
                        higestAvarageSalery=totalSalary[i]/3;
                        higestAvarageDepartment = department[i];


                    }



                }

            }

        }
        System.out.println("higest salery department "+higestAvarageDepartment);
        System.out.println(higestAvarageDepartment +" higest avarage salery "+higestAvarageSalery);
    }
}