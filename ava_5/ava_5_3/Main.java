package ava_5.ava_5_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entere of number of values");
        int n = sc.nextInt();

        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            int m = i + 1;
            System.out.println("entre the value " + m);
            values[i] = sc.nextInt();
        }

        // Print the array
        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

        // Reverse the array elements in place
        for (int i = 0; i < n / 2; i++) {
            int temp = values[i];
            values[i] = values[n - 1 - i];
            values[n - 1 - i] = temp;
        }

        // Print the reversed array
        System.out.print("Reversed array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

    }
}
