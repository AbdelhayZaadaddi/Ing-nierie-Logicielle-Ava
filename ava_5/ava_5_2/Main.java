package ava_5.ava_5_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many questions are in the quiz?");
        int nQues = sc.nextInt();

        int[] key = new int[nQues];
        System.out.println("Enter the " + nQues + " correct answers:");
        for (int i = 0; i < nQues; i++) {
            key[i] = sc.nextInt();
        }

        char response;
        do {
            System.out.println("Enter the answers for the quiz");
            int correctCount = 0;

            for (int i = 0; i < nQues; i++) {
                int answer = sc.nextInt();
                if (answer == key[i]) {
                    correctCount++;
                }
            }
            System.out.println("You got " + correctCount + " correct answers");
            System.out.println("Do you want to continue y/n");
            response = sc.next().charAt(0);
        } while (response == 'y');
    }
}
