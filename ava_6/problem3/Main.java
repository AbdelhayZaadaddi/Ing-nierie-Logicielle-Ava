package ava_6.problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter library capacity: ");
        int n = sc.nextInt();
        Library lib = new Library(n);

        lib.add(new Novel("Shadow Slave", "GuiltyThree", 1000, 15.0));
        lib.add(new Magazine("Tech Today", "February", 2026));

        int choice;
        do {
            System.out.println("\n1. Add Novel  2. Display All  3. Delete by ID  4. Authors  0. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String t = sc.nextLine();
                    lib.add(new Novel(t, "Unknown", 200, 10.0));
                    break;
                case 2:
                    lib.displayDocuments();
                    break;
                case 3:
                    System.out.print("ID to delete: ");
                    int id = sc.nextInt();
                    Document doc = lib.document(id);
                    if (lib.delete(doc))
                        System.out.println("Deleted.");
                    break;
                case 4:
                    lib.displayAuthors();
                    break;
            }
        } while (choice != 0);
    }
}