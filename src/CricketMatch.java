import java.util.Scanner;

public class CricketMatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] score = new int[11];
        double totalScore = 0;

        for (int i = 0; i < 11; i++) {
            System.out.print("enter the player" + (i + 1) + " score :");
            score[i] = scan.nextInt();

        }

        for (int i =0;i<11;i++){
            totalScore += score[i];
        }

        int highestScore = score[0];
        for (int i = 0; i < 11; i++) {
            if (score[i] > highestScore) {
                highestScore = score[i];

            }
        }


        System.out.println("highest player score: " + highestScore);
        System.out.println("avarage player of score: " + totalScore / 11);
    }
}
